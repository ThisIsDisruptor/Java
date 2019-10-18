package com.epam.aleksandr_bastrychkin.java.lesson2;

public abstract class Sweet implements Comparable <Sweet> {
    private String name;
    private double weight;

    public int compareTo(Sweet s){
        return (int) (weight - s.weight);
    }


}
