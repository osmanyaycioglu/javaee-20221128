package com.training.javaee.teb.rest.employee.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.training.javaee.teb.custom.validation.CheckGender;

public class Employee {

    @NotNull(message = "name null olamaz")
    @NotEmpty
    @Size(min = 2, max = 15, message = "name {min} ile {max} arasında olmalı")
    private String  name;
    @NotNull
    @NotEmpty
    @Size(min = 3, max = 20)
    private String  surname;
    @Min(18)
    @Max(150)
    private Integer age;
    @Min(50)
    @Max(300)
    private Integer height;
    //    @NotNull
    //    @ContainsStr({
    //                   "ERKEK",
    //                   "KADIN",
    //                   "MALE",
    //                   "FEMALE"
    //    })
    @CheckGender
    private String gender;

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

    public String getGender() {
        return this.gender;
    }

    public void setGender(final String genderParam) {
        this.gender = genderParam;
    }


}
