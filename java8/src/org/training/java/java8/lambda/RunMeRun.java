package org.training.java.java8.lambda;


public class RunMeRun {

    public static void main(final String[] args) {
        IRunMe runMeLoc = (c,
                           z) -> "Running " + c + " count : " + z;

        IRunMe runMeLoc2 = (se,
                            op) -> {
            StringBuilder builderLoc = new StringBuilder();
            for (int i = 0; i < op; i++) {
                builderLoc.append("Running ")
                          .append(se)
                          .append(" count : ")
                          .append(i)
                          .append('\n');
            }
            return builderLoc.toString();
        };

        IRunMe runMeLoc3 = RunMeRun::xyz;
        // IRunMe runMeLoc4 = RunMeRun::abc; // yanlış binding
        System.out.println(runMeLoc3.run("method test",
                                         3));
        RunMeRun meRunLoc = new RunMeRun();

        IRunMe runMeLov4 = meRunLoc::ttt;
        System.out.println(runMeLov4.run("method test",
                                         3));

    }

    public String ttt(final String yy,
                      final int xx) {
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("Obejct ref Testing : ");
        for (int i = 0; i < xx; i++) {
            builderLoc.append(yy)
                      .append(",");
        }
        return builderLoc.toString();

    }


    public static String abc(final int b,
                             final String a) {
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("Testing : ");
        for (int i = 0; i < b; i++) {
            builderLoc.append(a)
                      .append(",");
        }
        return builderLoc.toString();


    }

    public static String xyz(final String a,
                             final int b) {
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("Static Testing : ");
        for (int i = 0; i < b; i++) {
            builderLoc.append(a)
                      .append(",");
        }
        return builderLoc.toString();

    }
}
