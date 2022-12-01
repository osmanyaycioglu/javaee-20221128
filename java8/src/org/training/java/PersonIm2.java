package org.training.java;

public class PersonIm2 {

    private final String name;
    private final String surname;
    private final int    height;
    private final int    weight;

    public PersonIm2(final String nameParam,
                     final String surnameParam,
                     final int heightParam,
                     final int weightParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.height = heightParam;
        this.weight = weightParam;
    }


    public String getName() {
        return this.name;
    }


    public String getSurname() {
        return this.surname;
    }


    public int getHeight() {
        return this.height;
    }


    public int getWeight() {
        return this.weight;
    }
}
