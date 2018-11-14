package com.wjf;

import com.wjf.domain.User;
import com.wjf.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWebApplicationTests {
@Autowired
private UserMapper userMapper;
    @Test
    public void contextLoads() {
        User objectById = userMapper.getObjectById(1);
        System.out.println(1);
    }

}
