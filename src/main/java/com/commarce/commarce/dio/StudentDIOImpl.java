package com.commarce.commarce.dio;

import com.commarce.commarce.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDIOImpl implements StudentDIO {

    //define fild for entity manager
    private final EntityManager entityManager;

    // Inject entity manager using constructor injection
    @Autowired
    public StudentDIOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //Implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        //save the student using entity manager
        entityManager.persist(theStudent);
    }

    //Implement search method
    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }
}
