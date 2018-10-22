package com.frameforks.sqliteLiquid.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Audited
@ToString
public class Student extends SuperEntity implements Serializable {

    private String name;

    private int age;

    private String phone;

}
