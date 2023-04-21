package com.test.test;

import com.test.test.entity.Student;
import com.test.test.myconfig.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.XmlServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(TestApplication.class, args);

//        ApplicationContext ctx = new ClassPathXmlApplicationContext("myConfig");

        Student st = context.getBean("st", Student.class);
        st.setFirstName("Paramjeet Singh");
        System.out.println("In Main Application, Started successfully." + st.getFirstName());
    }

}
