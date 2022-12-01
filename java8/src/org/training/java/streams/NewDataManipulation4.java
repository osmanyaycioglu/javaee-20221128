package org.training.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.training.java.Person;

public class NewDataManipulation4 {

    public static void main(final String[] args) {
        List<String> nameListLoc = Arrays.asList("osman yaycıoğlu",
                                                 "mehmet alak",
                                                 "ali muş",
                                                 "veli kamal",
                                                 "ayşe alaz",
                                                 "mehmet tüzel",
                                                 "ali ulak",
                                                 "veli kamal",
                                                 "ayşe kulis",
                                                 "mehmet tamer",
                                                 "ali ulak",
                                                 "veli xyz dhf",
                                                 "ayşe abc dss",
                                                 "fatma deneme sajdh");
        nameListLoc.stream()
                   .distinct()
                   .map(s -> s.split(" "))
                   .filter(sa -> sa.length == 2)
                   .filter(sa -> sa[0].length() > 3)
                   .map(sa -> Person.createPerson()
                                    .setName(sa[0])
                                    .setSurname(sa[1]))
                   .filter(p -> p.getName()
                                 .length() > 3)
                   .collect(Collectors.toList());

        Map<String, Person> collectLoc = nameListLoc.stream()
                                                    .distinct()
                                                    .map(s -> s.split(" "))
                                                    .filter(sa -> sa.length == 2)
                                                    .filter(sa -> sa[0].length() > 3)
                                                    .map(sa -> Person.createPerson()
                                                                     .setName(sa[0])
                                                                     .setSurname(sa[1]))
                                                    .filter(p -> p.getName()
                                                                  .length() > 3)
                                                    .collect(Collectors.toMap(p -> p.getName() + "_" + p.getSurname(),
                                                                              p -> p));
        collectLoc.values()
                  .forEach(System.out::println);
        collectLoc.keySet()
                  .forEach(System.out::println);

        List<Person> collectLoc2 = nameListLoc.stream()
                                              .distinct()
                                              .map(s -> s.split(" "))
                                              .filter(sa -> sa.length == 2)
                                              .filter(sa -> sa[0].length() > 3)
                                              .map(sa -> Person.createPerson()
                                                               .setName(sa[0])
                                                               .setSurname(sa[1]))
                                              .filter(p -> p.getName()
                                                            .length() > 3)
                                              .reduce(new ArrayList<Person>(),
                                                      (al,
                                                       p) -> {
                                                          al.add(p);
                                                          return al;
                                                      },
                                                      (al1,
                                                       al2) -> {
                                                          al1.addAll(al2);
                                                          return al1;
                                                      });

        collectLoc2.forEach(System.out::println);
        IntSummaryStatistics summaryStatisticsLoc = nameListLoc.stream()
                                                               .distinct()
                                                               .map(s -> s.split(" "))
                                                               .filter(sa -> sa.length == 2)
                                                               .filter(sa -> sa[0].length() > 3)
                                                               .map(sa -> Person.createPerson()
                                                                                .setName(sa[0])
                                                                                .setSurname(sa[1]))
                                                               .filter(p -> p.getName()
                                                                             .length() > 3)
                                                               .mapToInt(p -> p.getName()
                                                                               .length())
                                                               .summaryStatistics();
        System.out.println(summaryStatisticsLoc);

        DoubleSummaryStatistics c1 = nameListLoc.stream()
                                                .distinct()
                                                .map(s -> s.split(" "))
                                                .filter(sa -> sa.length == 2)
                                                .filter(sa -> sa[0].length() > 3)
                                                .map(sa -> Person.createPerson()
                                                                 .setName(sa[0])
                                                                 .setSurname(sa[1]))
                                                .filter(p -> p.getName()
                                                              .length() > 3)
                                                .collect(Collectors.summarizingDouble(p -> p.getName()
                                                                                            .length()));

        System.out.println(c1);
    }
}
