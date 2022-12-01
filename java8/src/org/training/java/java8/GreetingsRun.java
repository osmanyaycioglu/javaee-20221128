package org.training.java.java8;


public class GreetingsRun {

    public static void main(final String[] args) {
        IGreetings greetingsLoc = new GreetingsEng();
        greetingsLoc.writeBothToConsole("osman");
    }
}
