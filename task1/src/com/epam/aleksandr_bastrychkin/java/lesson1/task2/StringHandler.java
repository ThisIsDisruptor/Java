package com.epam.aleksandr_bastrychkin.java.lesson1.task2;

import java.util.Scanner;

public class StringHandler {
    public void runTask2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of strings: ");
        int stringsCount = in.nextInt();

        System.out.printf("Enter %d strings: \n", stringsCount);
        if (stringsCount > 0){
            String[] myStrings = StringProcessing.inputConsoleStrings(stringsCount);

            double averageLength = StringProcessing.calculateAverageStringLength(myStrings);
            System.out.printf("\nAverage length: %.2f", averageLength);

            System.out.println("\nStrings longer than average: ");
            StringProcessing.outputMoreThanAverageStrings(myStrings);
        }
    }
}
