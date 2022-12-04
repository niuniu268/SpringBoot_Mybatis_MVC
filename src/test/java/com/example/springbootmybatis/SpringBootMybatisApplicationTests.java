package com.example.springbootmybatis;

import com.example.springbootmybatis.dao.Usersdao;
import com.example.springbootmybatis.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMybatisApplicationTests {
    @Autowired
    private Usersdao usersdao;

    @Test
    void testSelectAll() {

        usersdao.selectAll();
    }

    @Test
    void testSelectByID(){
        Users users = usersdao.selectByID( 1 );
        System.out.println(users );
    }

}
