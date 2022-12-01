package org.training.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.training.java.Person;
import org.training.java.PersonIm;

public class NewDataManipulation6 {

    public static void main(final String[] args) {
        List<String> nameListLoc = Arrays.asList("osman",
                                                 "mehmet",
                                                 "ali",
                                                 "veli",
                                                 "ayşe",
                                                 "mehmet",
                                                 "ali",
                                                 "veli",
                                                 "ayşe",
                                                 "mehmet",
                                                 "ali",
                                                 "veli",
                                                 "ayşe",
                                                 "fatma");
        Stream<String> filterLoc = nameListLoc.stream()
                                              .distinct()
                                              .filter(s -> s.length() >= 4);

        Stream<Integer> map2Loc = nameListLoc.stream()
                                             .distinct()
                                             .filter(s -> s.length() >= 4)
                                             .map(s -> s.length());

        Stream<Person> mapLoc2 = nameListLoc.stream()
                                            .distinct()
                                            .filter(s -> s.length() >= 4)
                                            .map(s -> Person.createPerson()
                                                            .setName(s));

        Stream<Integer> map3Loc = nameListLoc.stream()
                                             .distinct()
                                             .filter(s -> s.length() >= 4)
                                             .map(s -> PersonIm.builder()
                                                               .withName(s)
                                                               .withSurname(s)
                                                               .build())
                                             .map(pi -> pi.getName()
                                                          .length())
                                             .filter(i -> i > 5)
                                             .peek(i -> System.out.println(i));


        Stream<Person> mapLoc = nameListLoc.stream()
                                           .distinct()
                                           .filter(s -> s.length() >= 4)
                                           .map(s -> Person.createPerson()
                                                           .setName(s))
                                           .filter(p -> p.getName()
                                                         .contains("a"));


    }
}
