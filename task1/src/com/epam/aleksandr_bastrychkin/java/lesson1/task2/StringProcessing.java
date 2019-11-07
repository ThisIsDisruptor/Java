package com.epam.aleksandr_bastrychkin.java.lesson1.task2;

import java.util.Scanner;

public class StringProcessing {

    public static String[] inputConsoleStrings(int count) {

        String[] strings = new String[count];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < count; i++){
            strings[i] = in.nextLine();
        }
        return strings;
    }

    public static double calculateAverageStringLength(String[] array) {
        double count = array.length;

        double sumStringLength = 0;
        for(int i = 0; i < count; i++) {
            sumStringLength += array[i].length();
        }

        double averageStringLength = sumStringLength / count;
        return averageStringLength;
    }

    public static void outputMoreThanAverageStrings(String[] array) {
        double averageLength = calculateAverageStringLength(array);

        double count = array.length;
        for(int i = 0; i < count; i++) {
            if(((double)array[i].length()) > averageLength) {
                System.out.println(array[i]);
            }
        }
    }
}
