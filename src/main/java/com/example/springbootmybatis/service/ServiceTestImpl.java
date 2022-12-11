package com.example.springbootmybatis.service;

import com.example.springbootmybatis.dao.Usersdao;
import com.example.springbootmybatis.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTestImpl implements ServiceTest {
    @Autowired
    private Usersdao usersdao;
    @Override
    public Users searchById(Integer id) {
        return usersdao.selectByID( id );
    }
}
