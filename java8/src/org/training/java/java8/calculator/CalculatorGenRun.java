package org.training.java.java8.calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.training.java.Person;

public class CalculatorGenRun {

    public static void main(final String[] args) {
        ICalcultorOperationGeneric<Integer> c1 = (a,
                                                  b) -> a + b;
        ICalcultorOperationGeneric<Integer> c2 = (a,
                                                  b) -> a / b;
        ICalcultorOperationGeneric<Long> c3 = (a,
                                               b) -> a / b;

        ICalcultorOperationGeneric<Double> c4 = (a,
                                                 b) -> a / b;
        ICalcultorOperationGeneric<Float> c5 = (a,
                                                b) -> a / b;

        System.out.println(c1.calculate(10,
                                        20));
        System.out.println(c2.calculate(10,
                                        20));
        System.out.println(c3.calculate(10L,
                                        20L));
        System.out.println(c4.calculate(10D,
                                        20D));
        System.out.println(c5.calculate(10F,
                                        20F));

        ICalcultorOperationGenericEx<Double, Integer, Long> c6 = (x,
                                                                  y) -> (double) (x / y);

        ICalcultorOperationGenericEx<Person, String, Integer> c7 = (s,
                                                                    i) -> Person.createPerson()
                                                                                .setName(s)
                                                                                .setHeight(i * 2)
                                                                                .setWeight(i);
        Person personLoc = c7.calculate("osman",
                                        100);
        System.out.println(personLoc);

        List<String> listLoc = Arrays.asList("osman",
                                             "ali",
                                             "veli");

        List<String> list2Loc = new ArrayList<>();

        list2Loc.add("osman");
        list2Loc.add("ali");

        for (String stringLoc : list2Loc) {
            System.out.println(stringLoc);
        }

        List<Object> list3Loc = new ArrayList<>();
        list3Loc.add(100);
        list3Loc.add("osman");
        list3Loc.add(BigDecimal.TEN);

        for (Object objectLoc : list3Loc) {
            if (objectLoc instanceof String) {
                String stringLoc = (String) objectLoc;
                System.out.println(stringLoc);
            } else if (objectLoc instanceof Integer) {
                Integer integerLoc = (Integer) objectLoc;

            }
        }

    }
}
