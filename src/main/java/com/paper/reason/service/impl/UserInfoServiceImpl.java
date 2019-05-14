package com.paper.reason.service.impl;

import com.paper.reason.dao.UserInfoMapper;
import com.paper.reason.model.UserInfo;
import com.paper.reason.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The document was created in 2019/5/14
 *
 * @author Lixingxing
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.findAll();
    }
}
