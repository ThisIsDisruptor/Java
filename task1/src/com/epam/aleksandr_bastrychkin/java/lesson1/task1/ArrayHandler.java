package com.epam.aleksandr_bastrychkin.java.lesson1.task1;

public class ArrayHandler {
    public void runTask1() {
        int[] myArray = ArrayProcessing.generateArray(20, -10,10);
        ArrayProcessing.outputArray(myArray);
        System.out.printf("\nOdd positions sum: %d", ArrayProcessing.calculateOddSum(myArray));
    }
}
