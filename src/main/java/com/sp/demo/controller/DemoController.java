package com.sp.demo.controller;

import com.sp.demo.entity.OrgUser;
import com.sp.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
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


    /**
    * description
    *
    * @author   Watson Wang
    * @created  2020/10/27 10:25
    **/
    @RequestMapping(value="/eat",method=RequestMethod.GET)
    @ResponseBody
    public Object eat(){
        String eat = demoService.eat();
        Map<String,Object> retMap = new HashMap<>();
        log.info("示例 - eat : {}",eat);
        retMap.put("eat",eat);
        return retMap;
    }

    /**
    * 获取所有用户
    *
    * @author   Watson Wang
    * @created  2020/10/27 11:41
    **/
    @RequestMapping(value="/getUser",method=RequestMethod.GET)
    @ResponseBody
    public List<OrgUser> getUser(){
        return demoService.getUser();
    }

}
