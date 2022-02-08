package com.home;

public class Main {

    public static void main(String [] args) {
	    int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        switch (args[2]){
            case "add":
                System.out.println(firstNumber + secondNumber);
                break;
            case "sub":
                System.out.println(firstNumber - secondNumber);
                break;
            case "mul":
                System.out.println(firstNumber * secondNumber);
                break;
            case "div":
                System.out.println(firstNumber / secondNumber);
                break;
        }
        }
    }

