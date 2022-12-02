package com.training.javaee.teb.ejb;


public class MyStatelessProxy extends MyStatelessEJB {

    @Override
    public void doFirst(final int count) {
        // transaction aç
        // EJB stateless pool dan bir instance al
        MyStatelessEJB ejbLoc = null;
        ejbLoc.doFirst(count);
        // Pool a geri koy
        // commit
    }

    @Override
    public void doLast(final int count) {
        // EJB stateless pool dan bir instance al
        MyStatelessEJB ejbLoc = null;
        ejbLoc.doLast(count);
        // Pool a geri koy
    }


}
