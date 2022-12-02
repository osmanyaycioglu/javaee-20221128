package com.training.javaee.teb.ejb;

import java.io.Serializable;

import javax.ejb.LocalBean;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful
@LocalBean
public class MyStatefulEJB implements Serializable {

    private int counter = 0;

    //    @EJB
    //    private MyStatelessEJB myStatelessEJB;


    public MyStatefulEJB() {
    }

    //    @PostConstruct
    //    public void init() {
    //        this.myStatelessEJB.doFirst(10);
    //    }

    public void doFirst(final int count) {
        this.counter += count;
        System.out.println("First : " + this.counter);
    }

    public void doLast(final int count) {
        this.counter += count;
        System.out.println("Last : " + this.counter);
    }

    @PrePassivate
    public void serialize() {
        // resource kapat
    }

    @PostActivate
    public void deserialize() {
        // resource aç
    }

    @Remove
    public void remove() {
        // öldürmek için
    }

    public int getCounter() {
        return this.counter;
    }

    public void setCounter(final int counterParam) {
        this.counter = counterParam;
    }

}
