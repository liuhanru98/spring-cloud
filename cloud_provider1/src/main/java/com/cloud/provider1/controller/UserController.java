package com.cloud.provider1.controller;

import com.cloud.provider1.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud
 * @description:
 * @author: liuhanru
 * @create: 2019-05-17 08:56
 **/
@RestController
public class UserController {
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {

        User findOne = new User();
        if (id == 1) {
            findOne.setAge(28);
            findOne.setName("wangwu");
            findOne.setUsername("wangwu");
            findOne.setId(1L);
            findOne.setBalance(600D);
        } else {
            findOne.setAge(26);
            findOne.setName("zhaoliu");
            findOne.setUsername("zhaoliu");
            findOne.setId(2L);
            findOne.setBalance(4000D);
        }
        return findOne;
    }
}