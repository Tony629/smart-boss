package com.shinetech.smartboss;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class})
@MapperScan("com.shinetech.smartboss.dao")
public class SmartBossApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartBossApplication.class, args);
    }

}
