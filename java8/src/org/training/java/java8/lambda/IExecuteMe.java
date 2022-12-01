package org.training.java.java8.lambda;


@FunctionalInterface
public interface IExecuteMe {

    String execute(String command);

    default void run(final String command) {
        System.out.println("Executing : " + this.execute(command));
    }

}
