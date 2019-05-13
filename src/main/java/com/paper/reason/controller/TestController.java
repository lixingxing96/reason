package com.paper.reason.controller;

import com.alibaba.fastjson.JSON;
import com.paper.reason.model.JieShou;
import com.paper.reason.service.TestService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

/**
 * The document was created in 2019/5/12
 *
 * @author Lixingxing
 */
@Log
@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    private TestService testService;

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        // 建立数据库 连接
        String url = "jdbc:mysql://localhost:3306/test";
        String uid = "root";
        String pw = "root";
        Connection conn = (Connection) DriverManager.getConnection(url, uid, pw);
        System.out.println("数据库连接成功!!!");

    }

    @RequestMapping("test01")
    public List<JieShou> getAll() {
        List<JieShou> all = testService.getAll();
        log.info(JSON.toJSONString(all));
        return all;
    }

    @RequestMapping("test02")
    public JieShou getJieshou() {
        return testService.getJieshou();
    }


}
