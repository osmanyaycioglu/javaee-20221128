package com.training.javaee.teb.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class Employee2 {

    @QueryParam("isim")
    private String  name;
    @HeaderParam("soy")
    private String  surname;
    @MatrixParam("yas")
    private Integer age;
    @FormParam("boy")
    private Integer height;
    @PathParam("gen")
    private String  gender;

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
