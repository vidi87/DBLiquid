package com.frameforks.sqliteLiquid.DAO.impl;

import com.frameforks.sqliteLiquid.DAO.StudentDAO;
import com.frameforks.sqliteLiquid.entity.Student;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private static final Logger LOG = LogManager.getLogger(StudentDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void add(Student student) {
        sessionFactory.getCurrentSession().save(student);
        LOG.info("Student saved successfully, student details - " + student.toString());
    }

    public void update(Student student) {
        sessionFactory.getCurrentSession().update(student);
        LOG.info("Student updated successfully, student details - " + student.toString());
    }

    public void delete(Student student) {
        sessionFactory.getCurrentSession().delete(student);
        LOG.info("Student deleted successfully, student details - " + student.toString());
    }
}
