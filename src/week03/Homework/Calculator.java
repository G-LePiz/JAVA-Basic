package week03.Homework;

import java.util.Scanner;

public class Calculator {
//     AddOperation a;  //필드
//     SubstractOperation s;
//     DivideOperation d;
//     MultiplyOperation m;
    AbstractOperation abs;

    public Calculator(AbstractOperation abs) {
        this.abs = abs;
    }

    double calculate(int firstNumber, int secondNumber) {
        return abs.operate(firstNumber, secondNumber);

//        double answer = 0;
//        if (abs== "+") {
//            answer = abs.operate(firstNumber, secondNumber);
//        } else if (abs == "-") {
//            answer = abs.operate(firstNumber, secondNumber);
//        } else if (operator == "*") {
//            answer = abs.operate(firstNumber, secondNumber);
//        } else if (operator == "/") {
//            answer = abs.operate(firstNumber, secondNumber);
//        } else if (operator == "%") {
//            answer = firstNumber % secondNumber;
//        }
//        return answer;



    }




}
