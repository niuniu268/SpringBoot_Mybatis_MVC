package com.example.springbootmybatis.service;

public interface MsgService {

    public String get(String tel);
    public boolean check (String tel, String code);
}
