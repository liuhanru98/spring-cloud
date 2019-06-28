package com.cloud.cloudproviderhystrix.controller;

import com.cloud.cloudproviderhystrix.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    //@HystrixCommand(fallbackMethod="helloExe")
    public User findById(@PathVariable Long id) {

        User findOne = new User();
        if (id == 1) {
            findOne.setAge(20);
            findOne.setName("zhangsan");
            findOne.setUsername("zhangsan");
            findOne.setId(1L);
            findOne.setBalance(800D);
        } else if(id == 2){
            findOne.setAge(18);
            findOne.setName("lisi");
            findOne.setUsername("lisi");
            findOne.setId(2L);
            findOne.setBalance(2000D);
        }
        return findOne;
    }

   /* public User helloExe(@PathVariable Long id){
        User findOne = new User();
        findOne.setAge(0);
        findOne.setName("");
        findOne.setUsername("");
        findOne.setId(0L);
        findOne.setBalance(0D);
        return findOne;
    }*/
}