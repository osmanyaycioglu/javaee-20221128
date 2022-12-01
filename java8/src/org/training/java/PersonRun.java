package org.training.java;


public class PersonRun {

    public static void main(final String[] args) {

        Person personLoc = new Person();
        personLoc.setName("Osman");
        Car carLoc = new Car();
        carLoc.setCurrentSpeed(120);
        carLoc.forward(100);
        personLoc.setSurname("Yaycıoğlu");
        personLoc.setWeight(100);
        personLoc.setHeight(200);

        Person person2Loc = Person.createPerson()
                                  .setName("osman")
                                  .setSurname("yaycıoğlu")
                                  .setHeight(200)
                                  .setWeight(100);


        System.out.println("Person : " + personLoc.getName() + " " + personLoc.getSurname());

        PersonIm imLoc = PersonIm.builder()
                                 .withName("osman")
                                 .withSurname("yaycıoğlu")
                                 .withHeight(200)
                                 .withWeight(100)
                                 .build();

        PersonIm2 im2Loc = new PersonIm2("osman",
                                         "yaycıoğlu",
                                         200,
                                         100);

    }

}
