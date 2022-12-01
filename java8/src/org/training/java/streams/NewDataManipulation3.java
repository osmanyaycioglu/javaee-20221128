package org.training.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NewDataManipulation3 {

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
        boolean anyMatchLoc = nameListLoc.stream()
                                         .distinct()
                                         .filter(s -> s.length() >= 4)
                                         .anyMatch(s -> "fatma".equals(s));

        boolean b2 = nameListLoc.stream()
                                .distinct()
                                .filter(s -> s.length() >= 4)
                                .noneMatch(s -> "osman".equals(s));

        Optional<String> findAnyLoc = nameListLoc.stream()
                                                 .distinct()
                                                 .filter(s -> s.length() >= 8)
                                                 .findAny();
        String orElseLoc = findAnyLoc.orElse("deneme");
        System.out.println("Sonuç : " + orElseLoc);

    }
}
