package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class Servlet {
    @GetMapping("/{id}")
    @ResponseBody
    public String selectById(@PathVariable Integer id){

        System.out.println("SpringBoot visit page ->"  + id );

        return "{'module': 'SpringBoot'}";
    }
}
