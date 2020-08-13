package com.study.sevice;

import com.study.dao.UserDaoMapper;
import com.study.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    UserDaoMapper userDaoMapper;

    public void test() {
        System.out.println("this is UserService");
    }

    public User getUser(String username) {
        return userDaoMapper.getUser(username);
    }
}
