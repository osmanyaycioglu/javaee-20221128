package org.training.java.java8.calculator;

@FunctionalInterface
public interface ICalcultorOperationGeneric<T> {

    T calculate(T val1,
                T val2);

}
