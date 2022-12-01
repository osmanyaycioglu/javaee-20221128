package org.training.java.java8.lambda.intf;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredictionRun {

    public static void main(final String[] args) {
        Predicate<String> p1 = s -> s.length() > 5;
        if (p1.test("osmanyay")) {
            System.out.println("5 den büyük");
        }
        Predicate<Integer> p3 = i -> (i >= 0) && (i < 10);
        Predicate<Integer> p4 = i -> (i >= 10) && (i < 100);
        Predicate<Integer> p5 = i -> (i >= 100) && (i < 1_000);
        Predicate<Integer> p6 = i -> (i >= 1_000) && (i < 10_000);
        Predicate<Integer> p7 = i -> (i >= 10_000) && (i < 100_000);

        BiPredicate<Integer, Integer> bip1 = (i1,
                                              i2) -> i1 > i2;
        boolean testLoc = bip1.test(100,
                                    10);
        BiPredicate<Integer, Integer> orLoc = bip1.and((z1,
                                                        z2) -> (z2 < 100) && (z1 > 100));
        orLoc.test(10000,
                   100);

        try (Scanner scannerLoc = new Scanner(System.in);) {
            while (true) {
                System.out.println("Bir rakam giriniz : ");
                int nextIntLoc = scannerLoc.nextInt();
                if (p3.test(nextIntLoc)) {
                    System.out.println("tek rakam");
                } else if (p4.test(nextIntLoc)) {
                    System.out.println("iki rakam");
                } else if (p5.test(nextIntLoc)) {
                    System.out.println("3 rakam");
                } else if (p6.test(nextIntLoc)) {
                    System.out.println("4 rakam");
                } else if (p7.test(nextIntLoc)) {
                    System.out.println("5 rakam");
                } else {
                    System.out.println("Çok rakam");
                }
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }


        //        Scanner scannerLoc = null;
        //        try {
        //            scannerLoc = new Scanner(System.in);
        //            while (true) {
        //                System.out.println("Bir rakam giriniz : ");
        //                int nextIntLoc = scannerLoc.nextInt();
        //                if (p3.test(nextIntLoc)) {
        //                    System.out.println("tek rakam");
        //                } else if (p4.test(nextIntLoc)) {
        //                    System.out.println("iki rakam");
        //                } else if (p5.test(nextIntLoc)) {
        //                    System.out.println("3 rakam");
        //                } else if (p6.test(nextIntLoc)) {
        //                    System.out.println("4 rakam");
        //                } else if (p7.test(nextIntLoc)) {
        //                    System.out.println("5 rakam");
        //                } else {
        //                    System.out.println("Çok rakam");
        //                }
        //            }
        //        } catch (Exception eLoc) {
        //            eLoc.printStackTrace();
        //        } finally {
        //            if (scannerLoc != null) {
        //                scannerLoc.close();
        //            }
        //        }
    }
}
