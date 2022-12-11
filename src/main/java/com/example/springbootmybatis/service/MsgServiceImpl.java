package com.example.springbootmybatis.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MsgServiceImpl implements MsgService{

    private HashMap<String, String> cache = new HashMap<String, String>();

    @Override
    public String get(String tel) {
        String s = tel;

        cache.put( tel,s );


        return s;
    }

    @Override
    public boolean check(String tel, String code) {

        String s = cache.get( tel );
        return code.equals( s );
    }
}
