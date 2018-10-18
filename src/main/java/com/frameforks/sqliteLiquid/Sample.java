package com.frameforks.sqliteLiquid;

import com.frameforks.sqliteLiquid.DAO.impl.StudentDAOImpl;
import com.frameforks.sqliteLiquid.config.AppConfig;
import com.frameforks.sqliteLiquid.entity.Group;
import com.frameforks.sqliteLiquid.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Sample {

    @Autowired
   static StudentDAOImpl studentDAO;

    public static void main(String[] args) throws ClassNotFoundException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

   //     StudentDAOImpl studentDAO = context.getBean(StudentDAOImpl.class);
        Student stud = new Student();
        Group group = new Group();
        group.setTitle("New smth");
        group.getStudentSet().add(stud);
        stud.setName("Mark");
        stud.setAge(23);
        stud.setPhone("qweqweqwe");

        studentDAO.add(stud);
    }
}
