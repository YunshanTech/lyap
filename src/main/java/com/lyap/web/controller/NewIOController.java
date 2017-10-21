package com.lyap.web.controller;

import com.lyap.entity.NewIO;
import com.lyap.service.NewIOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NewIOController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private NewIOService newIOService;


    @RequestMapping("/newio")
    public String newio(@RequestParam(value = "id") String aid, String power) {
        logger.info(String.format("id: %s, power: %s", aid, power));

        this.newIOService.insert(new NewIO(aid, power));

        return "OK";
    }

}
