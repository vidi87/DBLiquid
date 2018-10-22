package com.frameforks.sqliteLiquid.DAO.impl;

import com.frameforks.sqliteLiquid.DAO.StudentDAO;
import com.frameforks.sqliteLiquid.entity.Student;
import lombok.extern.log4j.Log4j;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Log4j
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

@Transactional
    public void add(Student student) {
        sessionFactory.getCurrentSession().save(student);
        log.info("Student saved successfully, student details - " + student.toString());
    }

    public void update(Student student) {
        sessionFactory.getCurrentSession().update(student);
        log.info("Student updated successfully, student details - " + student.toString());
    }

    public void delete(Student student) {
        sessionFactory.getCurrentSession().delete(student);
        log.info("Student deleted successfully, student details - " + student.toString());
    }
}
