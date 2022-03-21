package com.qfedu.fmmall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: Richered
 * @Date: 2022/3/22 1:01
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int userId;

    private String userName;

    private String userRealName;

    private String userImg;
}
