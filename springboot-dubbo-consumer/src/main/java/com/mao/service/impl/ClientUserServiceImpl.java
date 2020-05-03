package com.mao.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mao.entity.User;
import com.mao.service.ClientUserService;
import com.mao.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author bigdope
 * @create 2019-03-07
 **/
@Service
public class ClientUserServiceImpl implements ClientUserService {

    @Reference
    private UserService userService;

    @Override
    public User saveUser(User user) {
        if (user == null) {
            user = new User();
            user.setName("jack");
            user.setPassword("abcdefg");
        }
        System.out.println("=========================开始 调用springboot-dubbo-provider========================");
        System.out.println(user);
        userService.saveUser(user);
        System.out.println("=========================结束 调用springboot-dubbo-provider========================");
        return user;
    }

}
