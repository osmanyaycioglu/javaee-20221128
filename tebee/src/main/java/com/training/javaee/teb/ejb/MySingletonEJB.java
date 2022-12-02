package com.training.javaee.teb.ejb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@Singleton
@LocalBean
public class MySingletonEJB {

    private int                 counter  = 0;
    private final AtomicInteger counter1 = new AtomicInteger();
    List<String>                strings1 = new Vector<>();
    List<String>                strings2 = Collections.synchronizedList(new ArrayList<>());
    Map<String, String>         map      = new ConcurrentHashMap<>();


    public MySingletonEJB() {
    }

    @Lock(LockType.WRITE)
    public void doFirst(final int count) {
        this.counter += count;
        System.out.println("First : " + this.counter);
    }

    @Lock(LockType.WRITE)
    public void doLast(final int count) {
        this.counter += count;
        System.out.println("Last : " + this.counter);
    }

    @Lock(LockType.READ)
    public int getCounter() {
        return this.counter;
    }

    @Lock(LockType.WRITE)
    public void setCounter(final int counterParam) {
        this.counter = counterParam;
    }

}
