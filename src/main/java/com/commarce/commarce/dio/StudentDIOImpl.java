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

    @Override
    public List<Student> findAll() {
        // create the query
        //TypedQuery<Student> theQuery = entityManager.createQuery("from Student order by lastName desc", Student.class);
        TypedQuery<Student> theQuery = entityManager.createQuery("from Student", Student.class);
        // return the result
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        // Create JPQL query using the entity property name (case-sensitive)
        TypedQuery<Student> ckData = entityManager.createQuery("from Student where lastName = :theData", Student.class);

        // set Query parameters
        ckData.setParameter("theData", lastName);

        // return Query result
        return ckData.getResultList();
    }
}
