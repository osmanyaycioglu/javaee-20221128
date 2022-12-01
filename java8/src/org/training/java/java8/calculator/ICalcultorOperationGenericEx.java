package org.training.java.java8.calculator;

@FunctionalInterface
public interface ICalcultorOperationGenericEx<T, G, H> {

    T calculate(G girdi1,
                H girdi2);

}
