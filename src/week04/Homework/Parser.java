package week04.Homework;

import javax.naming.InsufficientResourcesException;
import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$"; // 정규표현식

    private final Calculator calculator = new Calculator(); //Calculator 클래스 끌어다가 쓰기
    private Main m = new Main();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        // 구현 1.
        // 예외처리, 숫자를 입력 받아야하는데 문자를 입력받으면 오류처리가 나게끔 해야함.
        if(!Pattern.matches(NUMBER_REG, firstInput)) {
            throw new BadInputException("정수값");
        }
        this.calculator.setFirstNumber(Integer.parseInt(firstInput));

        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {
        // 구현 1.
        if(!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException("정수값");
        }
        this.calculator.setFirstNumber(Integer.parseInt(secondInput));

        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        // 구현 1.
        if(!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("사칙 연산의 연산자");
        }
        switch (operationInput) {
            case "+" :
                this.calculator.setOperation(new AddOperation());
            case "-" :
                this.calculator.setOperation(new SubstractOperation());
            case "*" :
                this.calculator.setOperation(new MultiplyOperation());
            case "/" :
                this.calculator.setOperation(new DivideOperation());
        }

        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}

// 유저의 입력을 받아서 우리가 지난주에 구현한 계산기의 로직으로 전환시켜주는 객체