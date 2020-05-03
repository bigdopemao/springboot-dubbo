package com.mao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mao.entity.User;
import com.mao.service.UserService;
import org.springframework.stereotype.Component;

/**
 * 注册为 Dubbo 服务
 * @author bigdope
 * @create 2019-03-07
 **/
@Service(interfaceClass= UserService.class, timeout = 3000)
//@org.springframework.stereotype.Service
@Component
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        System.out.println(user);
        System.out.println("=========================成功 调用springboot-dubbo-provider========================");
        return user;
    }

}
