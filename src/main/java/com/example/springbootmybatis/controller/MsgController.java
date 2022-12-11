package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.domain.Users;
import com.example.springbootmybatis.service.MsgService;
import com.example.springbootmybatis.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/msg")
public class MsgController {
    @Autowired
    private MsgService msgService;

    @GetMapping("{tel}")
    public String inputTel (@PathVariable Integer tel){
        System.out.println(tel );

        String s = msgService.get( tel.toString( ) );

        return s;

    }
    @PostMapping
    public boolean check(String tel, String code){
        boolean check = msgService.check( tel, code );

        return check;
    }

}
