package com.sp.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoDao {


    @Select("select 'hello world' from dual")
    List<String> say();
}
