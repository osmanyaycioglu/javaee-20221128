package com.training.javaee.teb.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class MyStatelessEJB {

    public MyStatelessEJB() {
    }

    public void doFirst(final int count) {
        System.out.println("First : " + count);
    }

    public void doLast(final int count) {
        System.out.println("Last : " + count);
    }

}
