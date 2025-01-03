package week03.Homework;

public class AddOperation extends AbstractOperation {
    double result;

    @Override
    public double operate(int num1, int num2) {
        result = num1 + num2;
        return result;
    }
}
