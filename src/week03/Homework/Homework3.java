package week03.Homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Calculator calculator  = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(10, 20));
        Calculator calculator2 = new Calculator(new MultiplyOperation());
        System.out.println(calculator2.calculate(10,20));
    }
}
