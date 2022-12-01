package org.training.java.java8.calculator;


public class CalculatorRun {

    public static void main(final String[] args) {
        ICalcultorOperation toplama = (v1,
                                       v2) -> v1 + v2;
        ICalcultorOperation cikarma = (a,
                                       b) -> a - b;
        ICalcultorOperation carpma = (a,
                                      b) -> a * b;
        ICalcultorOperation bolme = (a,
                                     b) -> {
            if (b == 0D) {
                return 0D;
            }
            return a / b;
        };

        ICalcultorOperation bolme2 = CalculatorRun::calculateDiv;
        ICalcultorOperation bolme3 = CalculatorRun::calculateDivV2;

        System.out.println("Toplama sonuçu "
                           + toplama.calculate(10D,
                                               20D));

        System.out.println("Cıkarma sonuçu "
                           + cikarma.calculate(10D,
                                               20D));
        System.out.println("Çarpma sonuçu "
                           + carpma.calculate(10D,
                                              20D));
        System.out.println("Bölme sonuçu "
                           + bolme.calculate(10D,
                                             20D));
        System.out.println("0 Bölme sonuçu "
                           + bolme.calculate(10D,
                                             0D));
        System.out.println("Bölme2 sonuçu "
                           + bolme2.calculate(10D,
                                              20D));
        System.out.println("0 Bölme2 sonuçu "
                           + bolme2.calculate(10D,
                                              0D));
        System.out.println("Bölme3 sonuçu "
                           + bolme3.calculate(10D,
                                              20D));
        System.out.println("0 Bölme3 sonuçu "
                           + bolme3.calculate(10D,
                                              0D));

    }

    public static double calculateDiv(final double a1,
                                      final double a2) {
        if (a2 == 0D) {
            return 0D;
        }
        return a1 / a2;
    }

    public static double calculateDivV2(final double a1,
                                        final double a2) {
        if (a2 == 0D) {
            throw new NullPointerException();
        }
        return a1 / a2;
    }

}
