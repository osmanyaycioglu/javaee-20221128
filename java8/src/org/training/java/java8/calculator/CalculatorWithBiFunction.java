package org.training.java.java8.calculator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class CalculatorWithBiFunction {

    public static void main(final String[] args) {
        BiFunction<Double, Double, Double> toplama = (d1,
                                                      d2) -> d1 + d2;
        BiFunction<Double, Double, Double> cikarma = (d1,
                                                      d2) -> d1 - d2;
        BiFunction<Double, Double, Double> carpma = (d1,
                                                     d2) -> d1 * d2;
        BinaryOperator<Double> bolme = (d1,
                                        d2) -> {
            if (d2 == 0) {
                return 0D;
            }
            return d1 / d2;
        };

        System.out.println("Toplama "
                           + toplama.apply(40D,
                                           20D));
        System.out.println("Cikarma "
                           + cikarma.apply(40D,
                                           20D));
        System.out.println("Bölme "
                           + bolme.apply(40D,
                                         20D));
        System.out.println("Çarpma "
                           + carpma.apply(40D,
                                          20D));

        BiFunction<Double, Double, Double> andThenLoc = toplama.andThen(d -> d * 20)
                                                               .andThen(d -> d - 100D)
                                                               .andThen(d -> d / 10)
                                                               .andThen(e -> e / 5);

        System.out.println(andThenLoc.apply(40D,
                                            20D));

    }
}
