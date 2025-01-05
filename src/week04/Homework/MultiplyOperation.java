package week04.Homework;

public class MultiplyOperation extends AbstractOperation {
    private double result;

    @Override
    public double operate(int num1, int num2) {
        result = num1 * num2;
        return result;
    }
}
