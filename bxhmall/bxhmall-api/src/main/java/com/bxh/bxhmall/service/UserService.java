package com.bxh.bxhmall.service;

import com.bxh.bxhmall.response.UmsMember;
import com.bxh.bxhmall.response.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> findAll();

    List<UmsMemberReceiveAddress> findReceiveAddressByMemberId(String memberId);

}
