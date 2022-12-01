package org.training.java.java8.lambda.intf;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumeRun {

    public static void main(final String[] args) {
        Consumer<String> consumerLoc = w -> System.out.println(w);
        consumerLoc.accept("osman");
        Consumer<String> consumerLoc2 = System.out::println;
        consumerLoc2.accept("osman");

        List<String> listLoc = Arrays.asList("osman",
                                             "ali",
                                             "veli",
                                             "ayşe");

        for (String stringLoc : listLoc) {
            System.out.println(stringLoc);
        }
        System.out.println("--------");

        listLoc.forEach(System.out::println);
        System.out.println("--------");
        StringBuilder builderLoc = new StringBuilder();
        listLoc.forEach(s -> builderLoc.append(s)
                                       .append(" "));
        System.out.println(builderLoc);

        Consumer<List<String>> con2 = ls -> ls.forEach(System.out::println);
        con2.accept(listLoc);

        System.out.println("--------");
        Consumer<List<String>> con3 = list -> {
            StringBuilder sb = new StringBuilder();
            for (String stringLoc : listLoc) {
                sb.append(stringLoc)
                  .append(" ");
            }
            System.out.println("Toplam : " + sb);
        };
        con3.accept(listLoc);

        // -------------------------------------------
        BiConsumer<String, String> bc1 = (s1,
                                          s2) -> System.out.println(s1 + " - " + s2);
        bc1.accept("osman",
                   "yaycıoğlu");
    }
}
