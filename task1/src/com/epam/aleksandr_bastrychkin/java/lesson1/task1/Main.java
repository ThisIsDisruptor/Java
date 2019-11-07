package com.epam.aleksandr_bastrychkin.java.lesson1.task1;

import com.epam.aleksandr_bastrychkin.java.lesson1.task2.StringHandler;
import com.epam.aleksandr_bastrychkin.java.lesson1.task2.StringProcessing;
import com.epam.aleksandr_bastrychkin.java.lesson1.task3.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task1 ");
        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.runTask1();

        System.out.println("\n\nTask2");
        StringHandler stringHandler = new StringHandler();
        stringHandler.runTask2();

        System.out.println("\n\nTask3");
        Calculator calculator = new Calculator();
        calculator.runCalculator();
    }
}
