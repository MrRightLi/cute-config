package com.cutecloud.cuteconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CuteConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CuteConfigApplication.class, args);
    }

}
