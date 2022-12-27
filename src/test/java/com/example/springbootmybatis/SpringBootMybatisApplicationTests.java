package com.example.springbootmybatis;

import com.example.springbootmybatis.dao.Usersdao;
import com.example.springbootmybatis.domain.Users;
import com.example.springbootmybatis.service.ServiceTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMybatisApplicationTests {
    @Autowired
    private Usersdao usersdao;

    @Autowired
    private ServiceTest serviceTest;


    @Test
    void testSelectAll() {

        usersdao.selectAll();
    }

    @Test
    void testSelectByID(){
        Users users = usersdao.selectByID( 1 );
        System.out.println(users );
    }
    @Test
    void testCache(){
        Users users = serviceTest.searchById( 1 );
        System.out.println(users );
    }



}
