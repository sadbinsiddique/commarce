package com.commarce.commarce.dio;

import com.commarce.commarce.entity.Student;

import java.util.List;

public interface StudentDIO {
    void save(Student theStudent);

    //for search
    Student findById(int id);

    List<Student> findAll();
}
