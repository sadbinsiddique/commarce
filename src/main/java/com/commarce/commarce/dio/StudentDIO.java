package com.commarce.commarce.dio;

import com.commarce.commarce.entity.Student;

import java.util.List;

public interface StudentDIO {
    void save(Student theStudent);

    //for search
    Student findById(int id);

    //Get All Result
    List<Student> findAll();

    List<Student> findByLastName(String LastName);
}
