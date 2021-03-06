package com.sp.demo.service.impl;

import com.sp.demo.entity.OrgUser;
import com.sp.demo.service.DemoService;
import com.sp.demo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired(required=false)
    DemoDao demoDao;

    @Override
    public String say() {
        return demoDao.say();
    }

    @Override
    public String eat() {
        return demoDao.eat();
    }

    @Override
    public List<OrgUser> getUser() {
        return demoDao.getUser();
    }
}
