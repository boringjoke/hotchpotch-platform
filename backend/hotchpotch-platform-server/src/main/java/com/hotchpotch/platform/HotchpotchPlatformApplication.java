package com.hotchpotch.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hotchpotch.platform.**.mapper")
@SpringBootApplication
public class HotchpotchPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotchpotchPlatformApplication.class, args);
    }
}