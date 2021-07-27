package com.priyam.starter.entity;

import com.priyam.starter.model.EmployeeDTO;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @Column(name = "date_of_birth")
    private String dob;

    public Employee() {}

    public Employee(EmployeeDTO employeeDTO) {
        this.id = id;
        this.name = employeeDTO.getName();
        this.email = employeeDTO.getEmail();
        this.password = employeeDTO.getPassword();
        this.dob = employeeDTO.getDateOfBirth();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
