package org.training.java.streams;

import java.util.Arrays;
import java.util.List;

public class NewDataManipulation2 {

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
        nameListLoc.stream()
                   .distinct()
                   .filter(s -> s.length() >= 4)
                   .forEach(System.out::println);
        System.err.println("------------------------------");
        nameListLoc.stream()
                   .peek(s -> System.out.println("Data before : "
                                                 + s
                                                 + " Thread : "
                                                 + Thread.currentThread()
                                                         .getName()))
                   .distinct()
                   .peek(s -> System.out.println("Data filter : "
                                                 + s
                                                 + " Thread : "
                                                 + Thread.currentThread()
                                                         .getName()))
                   .filter(s -> s.length() >= 4)
                   .peek(s -> System.out.println("Data foreach : "
                                                 + s
                                                 + " Thread : "
                                                 + Thread.currentThread()
                                                         .getName()))
                   .forEach(System.out::println);

    }
}
