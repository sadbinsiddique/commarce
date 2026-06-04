package com.commarce.commarce.dio;

import com.commarce.commarce.entity.Student;

public interface StudentDIO {
    void save(Student theStudent);

    //for search
    Student findById(int id);
}
