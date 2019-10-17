package com.epam.aleksandr_bastrychkin.java.lesson1.task1;

public class ArrayProcessing {

    public static int[] generateArray(int arrayLength, int low, int high) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            array[i] = (int)(Math.random()*((high-low)+1))+low;
        }
        return array;
    }

    public static void outputArray(int[] array) {
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int oddSum(int[] array) {
        int sum = 0;
        if (array.length < 2 ) {
            System.out.print("No odd positions! ");
        } else {
            for (int i = 1; i < array.length; i += 2) {
                sum += array[i];
            }
        }
        return sum;
    }

}
