package com.xj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xj.dao")
public class ExamXjApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamXjApplication.class, args);
    }

}
