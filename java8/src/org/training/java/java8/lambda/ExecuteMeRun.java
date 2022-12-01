package org.training.java.java8.lambda;


public class ExecuteMeRun {

    public static void main(final String[] args) {

        int count = 2;

        IExecuteMe executeMeLoc = new ExecuteMeImpl(count);
        System.out.println(executeMeLoc.execute("cd /user/osman"));

        IExecuteMe executeMeLoc2 = new IExecuteMe() {

            @Override
            public String execute(final String commandParam) {
                return "Executing anonymous " + count + " : " + commandParam;
            }
        };

        IExecuteMe executeMeLoc2a = new IExecuteMe() {

            @Override
            public String execute(final String commandParam) {
                return "Executing anonymous 2a " + count + " : " + commandParam;
            }

        };

        IExecuteMe executeMeLoc3 = a -> "Executing lambda " + count + " : " + a;
        IExecuteMe executeMeLoc3a = a -> "Executing lambda 3a " + count + " : " + a;

        System.out.println(executeMeLoc3.execute("test me"));
        // count = 3;
    }
}
