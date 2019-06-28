package com.cloud.provider.entity;

/**
 * @program: spring-cloud
 * @description:
 * @author: liuhanru
 * @create: 2019-05-17 08:57
 **/
public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private Double balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}