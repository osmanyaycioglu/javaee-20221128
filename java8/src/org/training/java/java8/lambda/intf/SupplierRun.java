package org.training.java.java8.lambda.intf;

import java.util.function.Supplier;

public class SupplierRun {

    public static void main(final String[] args) {
        int intVal1 = 0;
        Supplier<String> supplierLoc = () -> "osman";

        String stringLoc = supplierLoc.get();

        test("osman" + intVal1,
             3);

        test2(() -> "osman" + intVal1,
              3);
    }

    public static void test(final String str,
                            final Integer int1) {
        if (int1 == 2) {
            System.out.println(str);
        }
    }

    public static void test2(final Supplier<String> s1,
                             final Integer int1) {
        if (int1 == 2) {
            System.out.println(s1.get());
        }
    }

}
