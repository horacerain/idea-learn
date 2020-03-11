package com.horace.dao;

import com.horace.pojo.User;

import java.util.List;

/**
 * Created by Horace on 2020/3/10.
 *
 * @Time 17:50
 * @Auther Horace
 */
public interface UserMapper {
    void insertUser (User user);
    List<User> selectUserAll();
}
