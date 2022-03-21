package com.qfedu.dao;

import com.qfedu.api.ApiApplication;
import com.qfedu.fmmall.dao.UserDAO;
import com.qfedu.fmmall.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: Richered
 * @Date: 2022/3/22 1:21
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class UserDAOTest {

    @Resource
    UserDAO userDAO;

    @Test
    public void queryUserByName() {
        User user = userDAO.queryUserByName("zhaoliu");
        System.out.println(user);
    }
}