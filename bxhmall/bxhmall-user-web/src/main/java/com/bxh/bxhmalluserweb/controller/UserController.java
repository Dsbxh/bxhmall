package com.bxh.bxhmalluserweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bxh.bxhmall.response.UmsMember;
import com.bxh.bxhmall.response.UmsMemberReceiveAddress;
import com.bxh.bxhmall.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Reference(timeout = 60000,retries = 3)
    private UserService userService ;

    @RequestMapping("findAll")
    public List<UmsMember> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/findReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> findReceiveAddressByMemberId(String memberId) {
        return userService.findReceiveAddressByMemberId(memberId);
    }


}
