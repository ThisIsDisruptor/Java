package com.epam.aleksandr_bastrychkin.java.lesson2;

public class Candy extends Sweet {
    private int count;
    private double weightOfOne;


    public Candy(String name, int count, double weightOfOne){
        setName(name);
        setCount(count);
        setWeightOfOne(weightOfOne);
    }

    public double setWeight(){
        return (double) getCount() * getWeightOfOne();
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        setWeight();
    }

    public double getWeightOfOne() {
        return weightOfOne;
    }

    public void setWeightOfOne(double weightOfOne) {
        this.weightOfOne = weightOfOne;
        setWeight();
    }
}
