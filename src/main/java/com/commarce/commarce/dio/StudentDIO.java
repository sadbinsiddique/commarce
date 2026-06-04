package com.commarce.commarce.dio;

import com.commarce.commarce.entity.Student;

import java.util.List;

public interface StudentDIO {
    void save(Student theStudent);

    Student findById(int id);

    List<Student> findAll();

    List<Student> findByLastName(String LastName);

    void update(Student theStudent);

    void delete(int id);

    int deleteAll();
}
