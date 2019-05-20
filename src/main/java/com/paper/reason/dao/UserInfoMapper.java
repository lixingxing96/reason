package com.paper.reason.dao;

import com.paper.reason.model.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Long userSid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long userSid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> findAll();
}