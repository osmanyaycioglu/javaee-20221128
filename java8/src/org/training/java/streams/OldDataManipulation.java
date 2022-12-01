package org.training.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OldDataManipulation {

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
        Set<String> nameSetLoc = new HashSet<>();
        for (String stringLoc : nameListLoc) {
            nameSetLoc.add(stringLoc);
        }
        List<String> nameTemp = new ArrayList<>();
        for (String stringLoc : nameSetLoc) {
            if (stringLoc.length() >= 4) {
                nameTemp.add(stringLoc);
            }
        }
        Collections.sort(nameTemp);
        for (String stringLoc : nameTemp) {
            System.out.println(stringLoc);
        }
    }
}
