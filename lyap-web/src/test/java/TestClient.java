import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestClient {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        ExecutorService exec = Executors.newSingleThreadExecutor();
        ScheduledExecutorService scheduledExec = Executors.newSingleThreadScheduledExecutor();
        try {
            socket = new Socket("120.27.93.16", 8888);
            //socket = new Socket("127.0.0.1", 8888);
            is = socket.getInputStream();
            os = socket.getOutputStream();

            InputStream inputStream = is;
            exec.execute(() -> {
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if(br != null) {
                        try {
                            br.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

            OutputStream outputStream = os;
            scheduledExec.scheduleAtFixedRate(() -> {
                try {
                    send(outputStream, "{\"code\":\"PING\"}");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, 30, 30, TimeUnit.SECONDS);

            Scanner sc = new Scanner(System.in);
            String line;
            while ((line = sc.nextLine()) != null) {
                send(os, line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            exec.shutdown();
            scheduledExec.shutdown();
        }
    }

    public static synchronized void send(OutputStream os, String msg) throws IOException {
        if(msg != null) {
            os.write((msg + '\n').getBytes("utf-8"));
            os.flush();
        }
    }

}
