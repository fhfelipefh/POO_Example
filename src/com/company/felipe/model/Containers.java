package com.company.felipe.model;

public abstract class Containers {
    private int capacityMax;
    private double weight;
    private int currentValueMl;

    public void fill(int value){
        if(value > getCapacityMax() || value + getCurrentValueMl() > getCapacityMax()){
            System.out.println("Não foi permitido, o recipiente irá transbordar. o recipiente contém atualmente: " + currentValueMl);
        }else {
            currentValueMl = currentValueMl + value;
            System.out.println("Você preencheu o recipiente e ele possui agora " + getCurrentValueMl() + "ml");
        }
    }

    public void drainOut(){
        setCurrentValueMl(0);
        System.out.println("O recipiente agora está vazio.");
    }

    public void calcweight(double density){
        // D = m.v
        double nweight = density*getCurrentValueMl();
        nweight = nweight + getWeight();
        System.out.println("O peso atual do recipiente é: " + nweight + "g");
        System.out.println("O conteúdo em Ml do recipiente é: "+getCurrentValueMl()+"Ml");
    }

    public int getCapacityMax() {
        return capacityMax;
    }

    public void setCapacityMax(int capacityMax) {
        this.capacityMax = capacityMax;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCurrentValueMl() {
        return currentValueMl;
    }

    public void setCurrentValueMl(int currentValueMl) {
        this.currentValueMl = currentValueMl;
    }

}

