package com.pearl.boot;

import com.pearl.boot.scope.SessionReplicationAwareScopeMetadataResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(scopeResolver = SessionReplicationAwareScopeMetadataResolver.class)
@ComponentScan(basePackages = "com.pearl.boot")
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}
