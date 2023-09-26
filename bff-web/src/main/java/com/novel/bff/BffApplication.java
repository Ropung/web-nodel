package com.novel.bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import static com.novel.common.support.ServerConstants.BASE_PACKAGE;

@SpringBootApplication(scanBasePackages = BASE_PACKAGE)
@ConfigurationPropertiesScan(basePackages = BASE_PACKAGE)
public class BffApplication {
    public static void main(String[] args) {
        SpringApplication.run(BffApplication.class, args);
    }
}
