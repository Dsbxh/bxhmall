package com.bxh.bxhmalluser.mapper;

import com.bxh.bxhmall.response.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
