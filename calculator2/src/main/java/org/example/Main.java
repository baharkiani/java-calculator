package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numbers = readNumbers(sc);
        CalculatorService calc = new CalculatorService();
        double result = 0;

        while(true){
            System.out.println("----------Menu-----------");
            System.out.println("1 : add");
            System.out.println("2 : subtract");
            System.out.println("3 : divide");
            System.out.println("4 : multiply");
            System.out.println("5 : average");
            System.out.println("6 : minimum");
            System.out.println("7 : maximum");
            System.out.println("8 : remain devide");
            System.out.println("9 : enter new numbers");
            System.out.println("0 : Exit");

            Scanner sc2 = new Scanner(System.in);
            String choice = sc2.nextLine();

            try{
                switch (choice){
                    case "1":
                        result = calc.sum(numbers);
                        System.out.println("sum : " + result);
                        break;
                    case "2":
                        result = calc.mean(numbers);
                        System.out.println("sum : " + result);
                        break;
                    case "3":
                        result = calc.divide(numbers);
                        System.out.println("sum : " + result);
                        break;
                    case "4":
                        result = calc.multiply(numbers);
                        System.out.println("sum : " + result);
                        break;
                    case "5":
                        result = calc.average(numbers);
                        System.out.println("sum : " + result);
                        break;
                    case "6":
                        result = calc.minimum(numbers);
                        System.out.println("sum : " + result);
                        break;
                    case "7":
                        result = calc.maximum(numbers);
                        System.out.println("sum : " + result);
                        break;
                    case "8":
                        result = calc.remainDivide(numbers);
                        System.out.println("sum : " + result);
                        break;
                    case "9":
                        numbers = readNumbers(sc);
                        break;
                    case "0":
                        System.out.println("finish!!");
                        return;
                    default:
                        System.out.println("Invalid choice");
                }

            }catch (Exception e){
                System.out.println("Something wrong happened: " + e.getMessage());
            }
        }
    }


    private static ArrayList<Double> readNumbers(Scanner sc) {
        System.out.println("Enter numbers separated by spaces: ");

        String[] inputNums = sc.nextLine().split(" ");
        ArrayList<Double> numbers = new ArrayList<>();

        for(int i = 0; i < inputNums.length; i++){
            double number = Double.parseDouble(inputNums[i]);
            numbers.add(number);
        }
        return numbers;
    }

    private static ArrayList<Double> sumNumbers(Scanner sc, double result){
        System.out.println("Enter numbers separated by spaces: ");
        String[] inputNums = sc.nextLine().split(" ");
        ArrayList<Double> numbers = new ArrayList<>();
        for(int i = 0; i < inputNums.length; i++){
            double number = Double.parseDouble(inputNums[i]);
            numbers.add(number);
        }
        return numbers;
    }
}