package org.training.java;

import java.io.Closeable;
import java.io.IOException;

public class HelloRun {

    public static void main(final String[] args) {
        IHello engLoc = new HelloTr();
        Closeable closeableLoc = new HelloEng();
        try {
            closeableLoc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        IHello helloLoc = (IHello) closeableLoc;

        Car carLoc = new HelloEng();


        System.out.println(engLoc.sayHello("osman",
                                           "yaycıoğlu"));

    }

}
