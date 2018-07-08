package com.njust.serviceImpl;

import com.njust.mapper.UserMapper;
import com.njust.pojo.User;
import com.njust.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginServiceImpl  implements LoginService {
    //进行用户的登录
    @Autowired
    private UserMapper  userMapper;

    public User login(String userCode, String userPassword) {
        //进行用户的查询，若存在则可以进行登录
        User user = userMapper.selectUser(userCode, userPassword);
       return user;

    }
}
