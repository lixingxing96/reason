package com.paper.reason.controller;

import com.paper.reason.model.UserInfo;
import com.paper.reason.service.UserInfoService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The document was created in 2019/5/14
 *
 * @author Lixingxing
 */
@Log
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userService;

    @RequestMapping("/findAll")
    public List<UserInfo> findAll() {
        try {
            List<UserInfo> lists = userService.findAll();
            return lists;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
