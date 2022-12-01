package org.training.java.java8;


public class GreetingsEng implements IGreetings {

    @Override
    public String sayHello(final String nameParam) {
        return "Hello " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Goodbye " + nameParam;
    }

}
