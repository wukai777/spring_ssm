package com.study.dao;

import com.study.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDaoMapper {
    User getUser(@Param("username") String username);
}
