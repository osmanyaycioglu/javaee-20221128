package org.training.java;


public class Car {

    private String name;
    private int    avgSpeed;
    private int    maxSpeed;
    private int    currentSpeed;
    private int    horsepower;
    private int    teaAmount;
    private int    counter;


    public void forward(final int second) {
        int forward = (second * this.currentSpeed) / 1000;
        System.out.println("İleri gidiyorum : " + forward);

    }

    public void fly() {
        System.out.println("Uçuyorum");
    }

    public void makeTea(final int amount) {
        System.out.println("çay yapıyorum");
    }


    public String getName() {
        return this.name;
    }


    public void setName(final String nameParam) {
        if (nameParam == null) {
            throw new IllegalArgumentException("name null olamaz");
        }
        this.name = nameParam;
    }


    public int getAvgSpeed() {
        return this.avgSpeed;
    }


    public void setAvgSpeed(final int avgSpeedParam) {
        this.avgSpeed = avgSpeedParam;
    }


    public int getMaxSpeed() {
        return this.maxSpeed;
    }


    public void setMaxSpeed(final int maxSpeedParam) {
        this.maxSpeed = maxSpeedParam;
    }


    public int getCurrentSpeed() {
        return this.currentSpeed;
    }


    public void setCurrentSpeed(final int currentSpeedParam) {
        this.currentSpeed = currentSpeedParam;
    }


    public int getHorsepower() {
        return this.horsepower;
    }


    public void setHorsepower(final int horsepowerParam) {
        this.horsepower = horsepowerParam;
    }


    public int getTeaAmount() {
        return this.teaAmount;
    }


    public void setTeaAmount(final int teaAmountParam) {
        this.teaAmount = teaAmountParam;
    }


}
