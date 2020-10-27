package com.sp.demo.service;


import com.sp.demo.entity.OrgUser;

import java.util.List;

public interface DemoService {
    /**
    * 打招呼
    *
    * @author   Watson Wang
    * @created  2020/10/27 10:41
    **/
    String say();

    /**
    * 吃点东西
    *
    * @author   Watson Wang
    * @created  2020/10/27 10:41
    **/
    String eat();

    /**
     * 获取所有用户
     *
     * @author Watson Wang
     * @created 2020/10/27 11:40
     **/
    List<OrgUser> getUser();
}
