package com.frameforks.sqliteLiquid;

import com.frameforks.sqliteLiquid.DAO.impl.StudentDAOImpl;
import com.frameforks.sqliteLiquid.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");


        StudentDAOImpl studentDAO = context.getBean(StudentDAOImpl.class);
        Student stud = new Student();
        stud.setName("Mark");
        stud.setAge(23);
        stud.setPhone("qweqweqwe");

        studentDAO.add(stud);
    }
}
