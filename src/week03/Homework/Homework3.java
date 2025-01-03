package week03.Homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        AddOperation a = new AddOperation();
        DivideOperation d = new DivideOperation();
        MultiplyOperation m = new MultiplyOperation();
        SubstractOperation s = new SubstractOperation();

        while (true){
            double answer =0;

            Scanner sc = new Scanner(System.in);
            System.out.println("첫번째 숫자를 입력하세요!: ");
            int num1 = sc.nextInt();
            System.out.println("두번째 정수를 입력하세요!: ");
            int num2 = sc.nextInt();
            while (true) {
                System.out.println("사칙연산자를 입력하세요!(+,-,*,/,%): ");
                char operation = sc.next().charAt(0);
                if (operation == '+') {
                    answer = a.operate(num1, num2);
                } else if (operation == '-') {
                    answer = s.operate(num1, num2);
                } else if (operation == '*') {
                    answer = m.operate(num1, num2);
                } else if (operation == '/') {
                    answer = d.operate(num1, num2);
                } else if (operation == '%') {
                    answer = num1 % num2;
                } else {
                    System.out.println("사칙연산 기호를 잘못 입력한 것 같습니다. 다시 시도해주세요.");
                    break;
                }
                System.out.println("결과값은 " + answer +"입니다");
                break;
            }
            break;
        }




    }
}
