package org.training.java;

import java.io.Closeable;
import java.io.IOException;

public class HelloEng extends Car implements IHello, Closeable, Comparable<HelloEng> {

    @Override
    public String sayHello(final String nameParam,
                           final String surnameParam) {
        return "Hello " + nameParam + " " + surnameParam;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closed");
    }

    @Override
    public int compareTo(final HelloEng oParam) {
        return 0;
    }


}
