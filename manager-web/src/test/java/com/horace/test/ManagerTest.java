package com.horace.test;

import com.horace.dao.UserMapper;
import com.horace.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Horace on 2020/3/11.
 *
 * @Time 10:33
 * @Auther Horace
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUserTest(){
        User user = new User();
        user.setUserage(18);
        user.setUsername("Dorcas");
        this.userMapper.insertUser(user);
    }
}
