package com.itheima.mapper;

import com.itheima.domain.Order;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper {
//    @Select("select * from orders o,user u where o.uid=u.id")
//    @Results({
//            @Result(column = "id",property = "id"),
//            @Result(column = "ordertime",property = "ordertime"),
//            @Result(column = "total",property = "total"),
//            @Result(column = "uid",property = "user.id"),
//            @Result(column = "username",property = "user.username"),
//            @Result(column = "password",property = "user.password"),
//    })
//    public List<Order> findAll();

    @Select("select * from orders o,user u where o.uid=u.id")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "ordertime",property = "ordertime"),
            @Result(column = "total",property = "total"),
           @Result(
                   property ="user" ,
                   column = "uid",
                   javaType = User.class,
                   one =@One(select ="com.itheima.mapper.UserMapper.findById")//要封装的属性名称

           )
    })
    public List<Order> findAll();
    @Select("select * from orders where uid=#{uid}")
    public List<Order> findByUid(int uid);
}
