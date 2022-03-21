package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.entity.User;

/**
 * @Author: Richered
 * @Date: 2022/3/22 1:02
 * @Description
 */
public interface UserDAO {

    public User queryUserByName(String name);
}
