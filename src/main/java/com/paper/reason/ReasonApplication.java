package com.paper.reason;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 再生纸缘项目
 */
@SpringBootApplication
@MapperScan("com.paper.reason.dao")
public class ReasonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReasonApplication.class, args);
    }

}
