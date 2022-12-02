package com.training.javaee.teb.services.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeDto {

    @Id
    @GeneratedValue
    private Long            employeeId;
    private String          name;
    private String          surname;
    private Integer         age;
    private Integer         height;
    private EEmployeeStatus employeeStatus;
    private String          username;
    private String          password;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(final Integer ageParam) {
        this.age = ageParam;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(final Integer heightParam) {
        this.height = heightParam;
    }

    public EEmployeeStatus getEmployeeStatus() {
        return this.employeeStatus;
    }

    public void setEmployeeStatus(final EEmployeeStatus employeeStatusParam) {
        this.employeeStatus = employeeStatusParam;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String passwordParam) {
        this.password = passwordParam;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(final Long employeeIdParam) {
        this.employeeId = employeeIdParam;
    }


}
