package com.bxh.bxhmall.service;

import com.bxh.bxhmall.beans.UmsMember;
import com.bxh.bxhmall.beans.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> findAll();

    List<UmsMemberReceiveAddress> findReceiveAddressByMemberId(String memberId);

}
