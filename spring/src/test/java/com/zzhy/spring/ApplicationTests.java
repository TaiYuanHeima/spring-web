package com.zzhy.spring;

import com.zzhy.spring.springbootdemo.SpringBootDemoApplication;
import com.zzhy.spring.springbootdemo.service.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)

public class ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
        System.out.println(userMapper.queryUserList());
    }


}
