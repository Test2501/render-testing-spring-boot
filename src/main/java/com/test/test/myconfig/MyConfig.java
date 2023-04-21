package com.test.test.myconfig;

import com.test.test.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean("st")
    public static Student returStudent() {
        return new Student();
    }


}
