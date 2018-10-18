package com.frameforks.sqliteLiquid.DAO.impl;

import com.frameforks.sqliteLiquid.DAO.GroupDAO;
import com.frameforks.sqliteLiquid.entity.Student;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GroupDAOImpl implements GroupDAO {

    private static final Logger LOG = LogManager.getLogger(GroupDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public List<Student> getGroup(long id) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Student s where s.id="+id).getResultList();
    }

    public void addStudent(long studId, long groupId) {
        //essionFactory.getCurrentSession().save()
    }

    public void removeStudent(long studId, long groupId) {

    }

    public void removeGroup(long groupId) {

    }
}
