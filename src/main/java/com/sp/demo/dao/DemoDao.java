package com.sp.demo.dao;

import com.sp.demo.entity.OrgUser;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoDao {


    @Select("select 'hello King' from dual")
    String say();

    String eat();

    List<OrgUser> getUser();
}
