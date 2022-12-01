package org.training.java.java8;


public interface IGreetings {


    //Before 1.8
    public static final String str1 = "osman";

    String sayHello(String name);

    String sayGoodbye(String name);


    // After 1.8
    String str2 = "osman";

    default String sayBoth(final String name) {
        return this.sayHello(name) + "\n" + this.sayGoodbye(name);
    }

    default void writeBothToConsole(final String name) {
        System.out.println(this.sayHello(name));
        System.out.println(this.sayGoodbye(name));
    }

    public static String callAll(final IGreetings greetingsParam,
                                 final String name) {
        return greetingsParam.sayHello(name) + "\n" + greetingsParam.sayGoodbye(name);
    }

}
