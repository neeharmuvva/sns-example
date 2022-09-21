package com.sns.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.context.config.annotation.EnableContextInstanceData;

@EnableContextInstanceData
@SpringBootApplication
public class SnsMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnsMessageApplication.class, args);
    }

}
