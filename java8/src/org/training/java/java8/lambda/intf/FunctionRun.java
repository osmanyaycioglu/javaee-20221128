package org.training.java.java8.lambda.intf;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

import org.training.java.Person;

public class FunctionRun {

    public static void main(final String[] args) {
        Function<String, Integer> f1 = s1 -> Integer.parseInt(s1);
        Integer applyLoc = f1.apply("123456");
        Function<String, Person> f2 = s1 -> Person.createPerson()
                                                  .setName(s1);
        Person apply2Loc = f2.apply("osman");
        // -----------------------------
        BiFunction<String, String, Integer> bf1 = (stringInput1,
                                                   stringInput2) -> Integer.parseInt(stringInput1)
                                                                    + Integer.parseInt(stringInput2);
        Integer apply3Loc = bf1.apply("100",
                                      "200");

        BiFunction<String, String, String> bf2 = (stringInput1,
                                                  stringInput2) -> stringInput1 + " " + stringInput2;
        BinaryOperator<String> bf3 = (stringInput1,
                                      stringInput2) -> stringInput1 + " " + stringInput2;

        BinaryOperator<Integer> binint1 = (i1,
                                           i2) -> Math.abs(i1) + i2;
        IntBinaryOperator binint2 = (i1,
                                     i2) -> Math.abs(i1) + i2;

        UnaryOperator<String> u1 = s -> s + " tested";

        Function<String, String> u2 = s -> s + " tested";

    }
}
