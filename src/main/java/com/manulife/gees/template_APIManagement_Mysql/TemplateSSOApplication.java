package com.manulife.gees.template_APIManagement_Mysql;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TemplateSSOApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateSSOApplication.class, args);
    }
}

