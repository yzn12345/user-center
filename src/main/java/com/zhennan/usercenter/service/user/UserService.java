package com.zhennan.usercenter.service.user;


import com.zhennan.usercenter.dao.user.UserMapper;
import com.zhennan.usercenter.domain.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

}
