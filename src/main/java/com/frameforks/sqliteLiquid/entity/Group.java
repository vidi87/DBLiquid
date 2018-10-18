package com.frameforks.sqliteLiquid.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name = "group")
public class Group implements Serializable {
    @Id
    @Column(name = "group_id")
    private long id;

    @OneToMany
    private Set<Student> studentSet;

    private String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", group=" + title +
                '}';

    }
}
