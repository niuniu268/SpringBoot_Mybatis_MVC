package com.example.springbootmybatis.domain;

import lombok.Data;

import javax.print.attribute.standard.PrinterURI;


public class Users {

    private Integer id;
    private String name;
    private String password;
    private String tel;




    public Users() {
    }

    public Users(Integer id, String name, String password, String tel) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.tel = tel;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String toString() {
        return "Users{id = " + id + ", name = " + name + ", password = " + password + ", tel = " + tel + "}";
    }
}
