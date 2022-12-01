package org.training.java;


public class HelloTr implements IHello {

    @Override
    public String sayHello(final String nameParam,
                           final String surnameParam) {
        return "Selam " + nameParam + " " + surnameParam;
    }


}
