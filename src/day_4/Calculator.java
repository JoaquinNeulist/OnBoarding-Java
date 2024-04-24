package day_4;

public class Calculator implements CalculatorOperation{
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int product(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int division(int num1, int num2) {
        return num1/num2;
    }
}

