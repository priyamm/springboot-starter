package com.priyam.starter.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EmployeeDTO {

    private Integer employeeId;
    private String name;
    private String email;
    private String password;
    private String dateOfBirth;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Integer employeeId, String name, String email, String password, String dateOfBirth) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
