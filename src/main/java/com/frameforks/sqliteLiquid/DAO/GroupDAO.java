package com.frameforks.sqliteLiquid.DAO;

import com.frameforks.sqliteLiquid.entity.Student;

import java.util.List;

public interface GroupDAO {
    List<Student> getGroup(long id);
    void addStudent(long studId, long groupId);
    void removeStudent(long studId, long groupId);
    void removeGroup(long groupId);
}
