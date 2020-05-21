package com.sp.demo.controller;

import com.sp.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    DemoService demoService;
    /**
    * description default
    *
    * @author   Watson Wang
    * @created  2020/5/19 10:57
    **/
    @RequestMapping(value="/say",method=RequestMethod.GET)
    @ResponseBody
    public Object say(){
        String beSay = demoService.say();
        Map<String,Object> retMap = new HashMap<>();
        log.info("示例 - say : {}",beSay);
        retMap.put("say",beSay);
        return retMap;
    }
}
