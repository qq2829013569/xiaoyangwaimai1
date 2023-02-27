package com.xiaoyangwaimai.back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.xiaoyangwaimai.*.dao")
@ComponentScan("com.xiaoyangwaimai")
public class XywmRun8001 {
    public static void main(String[] args) {
        SpringApplication.run(XywmRun8001.class,args);
    }
}
