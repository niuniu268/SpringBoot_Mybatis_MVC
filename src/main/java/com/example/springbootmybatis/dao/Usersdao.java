package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.domain.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface Usersdao {
    @Select( "select * from users where id = #{id};" )
     Users selectByID (@Param( "id" ) Integer id);
    @Select( "select * from users;" )
     List<Users> selectAll();
}
