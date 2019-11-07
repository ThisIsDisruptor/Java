package com.epam.aleksandr_bastrychkin.java.lesson1.task3;

import java.util.Scanner;

public class Calculator {
    private double firstOperand;
    private double secondOperand;


    public void runCalculator() {
        setFirstOperand();
        setSecondOperand();

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
        System.out.printf("Answer: %.2f", answer);
    }

    private double add() {
        return firstOperand + secondOperand;
    }

    private double substract() {
        return firstOperand - secondOperand;
    }

    private double multiply() {
        return firstOperand * secondOperand;
    }

    private double divide() {
        return firstOperand / secondOperand;
    }

    public void setFirstOperand() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input A: ");
        this.firstOperand = in.nextDouble();
    }

    public void setSecondOperand() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input B: ");
        this.secondOperand = in.nextDouble();
    }
}
