package com.novel.member.application.config;

import com.novel.passwordencoder.PasswordEncoderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordEncoderConfig {
    @Bean
    public PasswordEncoder passwordEncoder(PasswordEncoderFactory passwordEncoderFactory) {
        return passwordEncoderFactory.createBcrypt(12);
    }
}
