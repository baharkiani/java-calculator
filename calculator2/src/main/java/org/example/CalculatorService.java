package org.example;

import java.util.ArrayList;

public class CalculatorService {
    private void validateEmpty(ArrayList<Double> numbers) {
        if(numbers.isEmpty() || numbers == null){
            throw new IllegalArgumentException("you should enter at least one number");
        }
    }

    public double sum(ArrayList<Double> numbers) {
        validateEmpty(numbers);
        double result = 0.0;
        for(double i : numbers){
            result += i;
        }
        return result;
    }
    public double average(ArrayList<Double> numbers) {
        validateEmpty(numbers);
        double result = 0.0;
        for(double i : numbers){
            result += i;
        }
        result = result / numbers.size();
        return result;
    }
    public double mean(ArrayList<Double> numbers) {
        validateEmpty(numbers);
        double result = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            result = result - numbers.get(i);
        }
        return result;
    }
    public double multiply(ArrayList<Double> numbers) {
        validateEmpty(numbers);
        double result = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            if(numbers.get(i) == 0.0){
                result = 0;
            }
            result = result * i;
        }
        return result;
    }

    public double divide(ArrayList<Double> numbers) {
        validateEmpty(numbers);
        double result = numbers.get(0);
        for(int i  = 1; i < numbers.size(); i++){
            if(numbers.get(i) == 0){
                throw new ArithmeticException("divide by zero");
            }
            result = result / numbers.get(i);
        }
        return result;
    }

    public double minimum(ArrayList<Double> numbers) {
        validateEmpty(numbers);
        double result = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            if(result > numbers.get(i)){
                result = numbers.get(i);
            }
        }
        return result;
    }

    public double maximum(ArrayList<Double> numbers) {
        validateEmpty(numbers);
        double result = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            if(result < numbers.get(i)){
                result = numbers.get(i);
            }
        }
        return result;
    }

    public double remainDivide(ArrayList<Double> numbers) {
        validateEmpty(numbers);
        double result = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            if(numbers.get(i) == 0){
                throw new InvalidOperationException("تقسیم بر 0 ممکن نیست برادر!");

            }
                result = result % numbers.get(i);
        }
        return result;
    }
}
