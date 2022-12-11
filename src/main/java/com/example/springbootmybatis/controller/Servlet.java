package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.domain.Users;
import com.example.springbootmybatis.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class Servlet {
    @Autowired
    private ServiceTest serviceTest;


//    @GetMapping("/{id}")
    @ResponseBody
    public String selectById(@PathVariable Integer id){

        System.out.println("SpringBoot visit page ->"  + id );

        return "{'module': 'SpringBoot'}";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Users selectById2(@PathVariable Integer id){
       return serviceTest.searchById( id );
    }

}
