package com.company.felipe;

public class Bottle extends Containers {

    private int capacityMax;
    private double weight;
    private int currentValueMl;
    private boolean thermal;

    public Bottle() {
        this.capacityMax = capacityMax;
        this.weight = weight;
        this.currentValueMl = currentValueMl;
    }

    public boolean isThermal() {
        return thermal;
    }

    public void setThermal(boolean thermal) {
        this.thermal = thermal;
    }

}

