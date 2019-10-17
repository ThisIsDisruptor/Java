package com.epam.aleksandr_bastrychkin.java.lesson1.task2.src.com.epam.aleksandr_bastrychkin.java.lesson1.task1;

import com.epam.aleksandr_bastrychkin.java.lesson1.task2.src.com.epam.aleksandr_bastrychkin.java.lesson1.task2.StringProcessing;
import com.epam.aleksandr_bastrychkin.java.lesson1.task2.src.com.epam.aleksandr_bastrychkin.java.lesson1.task3.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task1\n ");
        int[] myArray = ArrayProcessing.generateArray(20, -10,10);
        ArrayProcessing.outputArray(myArray);
        System.out.print("\nOdd positions sum: " + ArrayProcessing.oddSum(myArray));

        System.out.println("\n\nTask2");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of strings: ");
        int stringsCount = in.nextInt();

        System.out.println("Enter " + stringsCount + " strings: ");
        if (stringsCount > 0){
            String[] myStrings = StringProcessing.inputConsoleStrings(stringsCount);

            double averageLength = StringProcessing.calculateAverageStringLength(myStrings);
            System.out.println("\nAverage length: " + averageLength);

            System.out.println("\nStrings longer than average: ");
            StringProcessing.outputMoreThanAverageStrings(myStrings);
        }

        System.out.println("\n\nTask3");
        Calculator calculator = new Calculator();
        calculator.runCalculator();
    }
}
