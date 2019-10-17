package com.epam.aleksandr_bastrychkin.java.lesson1.task3;

import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;


    public void runCalculator() {
        setA();
        setB();

        String operation = new String();
        double answer;

        Scanner in = new Scanner(System.in);
        System.out.println("Input operation: ");
        operation = in.nextLine();

        switch (operation) {
            case "+":
                answer = this.add();
                break;
            case "-":
                answer = this.substract();
                break;
            case "*":
                answer = this.multiply();
                break;
            case "/":
                answer = this.divide();
                break;
            default:
                System.out.println("Operation is not defined! ");
                answer = 0;
                break;
        }
        System.out.println("Answer: " + answer);
    }

    private double add() {
        return a + b;
    }

    private double substract() {
        return a - b;
    }

    private double multiply() {
        return a * b;
    }

    private double divide() {
        return a / b;
    }

    public void setA() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input A: ");
        this.a = in.nextDouble();
    }

    public void setB() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input B: ");
        this.b = in.nextDouble();
    }
}
