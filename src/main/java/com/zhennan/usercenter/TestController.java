package com.zhennan.usercenter;


import com.zhennan.usercenter.dao.user.UserMapper;
import com.zhennan.usercenter.domain.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;
    @GetMapping("/test")
    public User testInsert(){
        User user = new User();
        user.setAvatarUrl("xxx");
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        this.userMapper.insertSelective(user);
        return user;

    }
}
