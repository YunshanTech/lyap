<script src="${rc.contextPath}/dataTables/js/jquery.dataTables.min.js"></script>
<script src="${rc.contextPath}/dataTables/js/dataTables.bootstrap.min.js"></script>

<script>
    function sendMsg(key) {
        showModal({
            title: "发送信息",
            buttonText: "发送",
            url: "${rc.contextPath}/tcpConnection/sendMsg.htm",
            data: {
              key: key
            },
            buttonFunction: function() {
                confirmAlert("发送信息", "确认发送？", function () {
                    $.ajax({
                        type:'post',
                        url:'${rc.contextPath}/tcpConnection/sendMsg.json',
                        data:$("#dataForm").serialize(),
                        cache:false,
                        dataType:'json',
                        success:function(data) {
                            successAlert("发送信息", data.msg, function () {
                                closeModal();
                                refreshTable();
                            });
                        },
                        error: function (XMLHttpRequest, textStatus, errorThrown) {
                            errorAlert("发送信息", "请求失败", function() {
                                closeModal();
                                refreshTable();
                            });
                        }
                    });
                });
            }
        });
    }

    function closeConnection(key) {
        confirmAlert("关闭连接", "确认关闭？", function () {
            $.ajax({
                type:'post',
                url:'${rc.contextPath}/tcpConnection/close.json',
                data:{
                    key: key
                },
                cache:false,
                dataType:'json',
                success:function(data) {
                    successAlert("关闭连接", data.msg, function () {
                        closeModal();
                        refreshTable();
                    });
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    errorAlert("关闭连接", "请求失败", function () {
                        closeModal();
                        refreshTable();
                    });
                }
            });
        })

    }

    $(document).ready(function() {
        myDataTable = $('#sample-table-2').DataTable({
            "ordering": false,
            "searching": false,
            "lengthChange": false,
            "pageLength": 10,
            "processing": true,
            "serverSide": true,
            "ajax": {
                "url": "${rc.contextPath}/tcpConnection/query.json",
                "data": function(d) {
                    d.key = $('#key').val();
                }
            },
            "columnDefs": [{
                "render": function(data, type, row) {
                    var sendMsgButton = '<a class="green" href="javascript:void(0);" onclick="sendMsg(\'' + row[0] + '\')">' +
                            '<i class="icon-pencil bigger-130"></i>' +
                            '</a>';
                    var closeButton = '<a class="red" href="javascript:void(0);" onclick="closeConnection(\'' + row[0] + '\')">' +
                            '<i class="icon-trash bigger-130"></i>' +
                            '</a>';
                    return sendMsgButton + '&nbsp;&nbsp;&nbsp;&nbsp;' + closeButton;
                },
                "targets": 3
            }]
        });

        $('.dataTable').css({
            "width":"100%"
        });
        $('.dataTable').parent("div").css({
            "padding":"0px"
        });
    });
</script>