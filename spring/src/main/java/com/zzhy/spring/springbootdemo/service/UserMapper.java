package com.zzhy.spring.springbootdemo.service;

import com.zzhy.spring.springbootdemo.domin.User;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;
@Mapper
@Resource
public interface UserMapper {

    public List<User> queryUserList();
}
