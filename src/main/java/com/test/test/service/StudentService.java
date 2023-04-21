package com.test.test.service;

import com.test.test.dao.StudentDao;
import com.test.test.entity.Student;

import java.util.List;

public interface StudentService {
    public Student save(Student student);

    public List<Student> findAll();

    public Student findById(int id);

    void DeleteById(int id);

}
