package com.test.test.rest;

import com.test.test.entity.Student;
import com.test.test.service.StudentService;
import com.test.test.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {


    private StudentService studentService;


    @Autowired
    public TestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/hello")
    String sayHello() {
        System.out.println("In TestController /hello endpoint hit successfully.");
        return "Hello World!";
    }

    @GetMapping("/students")
    List<Student> getAllStudents() {
        System.out.println("In TestController /students endpoint hit successfully.");
        return studentService.findAll();
    }


    @PostMapping("/students")
    Student saveStudent(@RequestBody Student student) {
        System.out.println("In TestController /students endpoint hit successfully.");
        return studentService.save(student);
    }


    @DeleteMapping("/students/{id}")
    void delete(@RequestBody int id) {
        if (id > 10) {
            throw new RuntimeException("jsdnfjbdsjf jkn");
        }
        System.out.println("In TestController /students endpoint hit successfully.");
        studentService.DeleteById(id);
    }


}
