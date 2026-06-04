package com.commarce.commarce.dio;

import com.commarce.commarce.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDIOImpl implements StudentDIO {

    private final EntityManager entityManager;

    @Autowired
    public StudentDIOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {entityManager.merge(theStudent);}

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        // create the query
        TypedQuery<Student> theQuery = entityManager.createQuery("from Student", Student.class);


        // return the result
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String LastName) {
        // create the query
        TypedQuery<Student> theQuery = entityManager.createQuery("from Student where lastName=:theData", Student.class);
        theQuery.setParameter("theData", LastName);

        // return the result
        return theQuery.getResultList();
    }

    @Override
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(int id) {
        // retrieved the Data
        Student theStudent = entityManager.find(Student.class, id);
        //delete data
        entityManager.remove(theStudent);
    }
}
