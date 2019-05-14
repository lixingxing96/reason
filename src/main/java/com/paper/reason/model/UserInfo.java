package com.paper.reason.model;

import java.io.Serializable;

/**
 * 描述:user_info表的实体类
 * @version
 * @author:  栗星星
 * @创建时间: 2019-05-14
 */
public class UserInfo implements Serializable {
    /**
     * 主键
     */
    private Long userSid;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String userPw;

    /**
     * 状态
     */
    private String userStatus;

    /**
     * 微信ID
     */
    private String userWxid;

    /**
     * 主键
     * @return USER_SID 主键
     */
    public Long getUserSid() {
        return userSid;
    }

    /**
     * 主键
     * @param userSid 主键
     */
    public void setUserSid(Long userSid) {
        this.userSid = userSid;
    }

    /**
     * 用户名
     * @return USER_NAME 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return USER_PW 密码
     */
    public String getUserPw() {
        return userPw;
    }

    /**
     * 密码
     * @param userPw 密码
     */
    public void setUserPw(String userPw) {
        this.userPw = userPw == null ? null : userPw.trim();
    }

    /**
     * 状态
     * @return USER_STATUS 状态
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * 状态
     * @param userStatus 状态
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    /**
     * 微信ID
     * @return USER_WXID 微信ID
     */
    public String getUserWxid() {
        return userWxid;
    }

    /**
     * 微信ID
     * @param userWxid 微信ID
     */
    public void setUserWxid(String userWxid) {
        this.userWxid = userWxid == null ? null : userWxid.trim();
    }
}