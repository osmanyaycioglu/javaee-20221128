package org.training.java.java8.lambda;


public class ExecuteMeImpl implements IExecuteMe {

    int localCount;


    public ExecuteMeImpl(final int localCountParam) {
        super();
        this.localCount = localCountParam;
    }


    @Override
    public String execute(final String commandParam) {
        return "Executing " + this.localCount + " : " + commandParam;
    }

}
