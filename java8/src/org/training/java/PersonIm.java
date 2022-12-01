package org.training.java;

public class PersonIm {

    private final String name;
    private final String surname;
    private final int    height;
    private final int    weight;

    private PersonIm(final String nameParam,
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

    public static PersonImBuilder builder() {
        return new PersonImBuilder();
    }

    public static class PersonImBuilder {

        private String name;
        private String surname;
        private int    height;
        private int    weight;


        private PersonImBuilder() {
            super();
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


        public PersonImBuilder withName(final String nameParam) {
            this.name = nameParam;
            return this;
        }


        public PersonImBuilder withSurname(final String surnameParam) {
            this.surname = surnameParam;
            return this;
        }


        public PersonImBuilder withHeight(final int heightParam) {
            this.height = heightParam;
            return this;
        }


        public PersonImBuilder withWeight(final int weightParam) {
            this.weight = weightParam;
            return this;
        }

        public PersonIm build() {
            return new PersonIm(this.name,
                                this.surname,
                                this.height,
                                this.weight);
        }


    }
}
