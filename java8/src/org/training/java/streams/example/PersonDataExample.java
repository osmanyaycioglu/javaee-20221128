package org.training.java.streams.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.training.java.Person;

public class PersonDataExample {

    public static void main(final String[] args) {

        try {
            List<Person> collectLoc = Files.readAllLines(Paths.get("person.txt"))
                                           .stream()
                                           .map(s -> s.split(","))
                                           .filter(sa -> sa.length == 4)
                                           .filter(sa -> sa[2].matches("[0-9]+") && sa[3].matches("[0-9]+"))
                                           .map(sa -> Person.createPerson()
                                                            .setName(sa[0])
                                                            .setSurname(sa[1])
                                                            .setHeight(Integer.parseInt(sa[2]))
                                                            .setWeight(Integer.parseInt(sa[3])))
                                           .filter(p -> p.getHeight() >= 180)
                                           .collect(Collectors.toList());
            collectLoc.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
