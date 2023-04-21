package com.test.test.service;

import com.test.test.dao.StudentDao;
import com.test.test.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao dao;


    @Override
    public Student save(Student student) {
        return dao.save(student);
    }

    @Override
    public List<Student> findAll() {
        return dao.findAll();
    }

    @Override
    public Student findById(int id) {
        Optional<Student> optional = dao.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }

    @Override
    public void DeleteById(int id) {
        dao.deleteById(id);
    }
}
