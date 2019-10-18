package com.epam.aleksandr_bastrychkin.java.lesson2;

public abstract class Sweet implements Comparable <Sweet> {
    private String name;
    private double weight;

    public int compareTo(Sweet s){
        return (int) (getWeight() - s.getWeight());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
