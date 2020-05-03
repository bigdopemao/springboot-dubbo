package com.mao.controller;

import com.mao.entity.User;
import com.mao.service.ClientUserService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bigdope
 * @create 2019-03-07
 **/
@Api(tags = "用户")
@RequestMapping("/user")
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
     private ClientUserService clientUserService;

    @ApiOperation("保存")
    //这种方式swagger文档上不显示user的json数据格式
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "user", value = "用户", paramType = "body", required = true)
//    })
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public Object saveUser(@ApiParam(name ="user", value = "用户", required = true)@RequestBody User user) {
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
        return clientUserService.saveUser(user);
    }

}