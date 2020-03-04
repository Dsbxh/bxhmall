package com.bxh.bxhmalluser.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.bxh.bxhmall.response.UmsMember;
import com.bxh.bxhmall.response.UmsMemberReceiveAddress;
import com.bxh.bxhmall.service.UserService;
import com.bxh.bxhmalluser.mapper.UserMapper;
import com.bxh.bxhmalluser.mapper.UserReceiveAddressMapper;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserReceiveAddressMapper userReceiveAddressMapper;

    @Override
    public List<UmsMember> findAll() {
        return userMapper.selectAllUser();
    }

    @Override
    public List<UmsMemberReceiveAddress> findReceiveAddressByMemberId(String memberId) {
        /*UmsMemberReceiveAddress item = new UmsMemberReceiveAddress();
        item.setMemberId(memberId);
        List<UmsMemberReceiveAddress> result = userReceiveAddressMapper.select(item);*/

        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> result = userReceiveAddressMapper.selectByExample(example);
        return result;
    }
}
