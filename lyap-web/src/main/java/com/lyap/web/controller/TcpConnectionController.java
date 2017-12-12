package com.lyap.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.lyap.common.DateFormatUtil;
import com.lyap.entity.TcpConnection;
import com.lyap.page.PageResult;
import com.lyap.page.PageUtil;
import com.lyap.service.TcpConnectService;
import com.lyap.web.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TcpConnectionController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private TcpConnectService tcpConnectService;

    @RequestMapping("/tcpConnection/list.htm")
    public String list() {
        return "tcpConnection/list";
    }

    @RequestMapping("/tcpConnection/query.json")
    @ResponseBody
    public Object query(String key) {
        PageResult<TcpConnection> pageResult = tcpConnectService.findByPage(key);
        JSONObject result = PageUtil.parseResult(pageResult, tcpConnection -> {
            List<String> row = new ArrayList<>();
            row.add(tcpConnection.getName());
            row.add(DateFormatUtil.format(new Date(tcpConnection.getTime()), "yyyy-MM-dd HH:mm:ss"));
            return row;
        });

        return result;
    }


    @RequestMapping("/tcpConnection/sendMsg.htm")
    public String sendMsg(String key, Model model) {
        model.addAttribute("key", key);
        return "tcpConnection/sendMsg";
    }

    @RequestMapping("/tcpConnection/sendMsg.json")
    @ResponseBody
    public Object sendMsg(String key, String msg) {
        boolean success = false;
        try {
            success = tcpConnectService.sendMsg(key, msg);
        } catch (Exception e) {
            logger.error("发送消息失败", e);
        }

        String message = success ? "发送成功" : "发送失败";
        return new Result(success, message, null);
    }

    @RequestMapping("/tcpConnection/close.json")
    @ResponseBody
    public Object close(String key) {
        boolean success = false;
        try {
            success = tcpConnectService.close(key);
        } catch (Exception e) {
            logger.error("关闭失败", e);
        }

        String message = success ? "关闭成功" : "关闭失败";
        return new Result(success, message, null);
    }


}
