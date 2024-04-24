package day_4;
import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu {
    private CalculatorOperation calculator;
    private Scanner scan = new Scanner(System.in);

    public CalculatorWithMenu(CalculatorOperation calculator) {
        this.calculator = calculator;
    }

    public CalculatorWithMenu() {

    }

    @Override
    public void showMenu() {
        System.out.println(generateOptions());
    }

    @Override
    public boolean executeOperation() {
        int option;
        int num1, num2;

        System.out.print("Enter your first number: ");
        num1 = scan.nextInt();
        System.out.print("Enter your second number: ");
        num2 = scan.nextInt();
        System.out.print("Enter your option: ");
        option = scan.nextInt();

        switch (option){
            case 1:
                int sum = calculator.add(num1, num2);
                System.out.println("Result: " + sum);
                return true;
            case 2:
                int difference = calculator.subtract(num1, num2);
                System.out.println("Result: " + difference);
                return true;
            case 3:
                int product = calculator.product(num1, num2);
                System.out.println("Result: " + product);
                return true;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    int division = calculator.division(num1, num2);
                    System.out.println("Result: " + division);
                }
                return true;
            default:
                System.out.println("Invalid option");
                return false; // Devuelve falso para indicar que se debe cerrar el programa
        }
    }

    private String generateOptions(){
        return """
                Choose your option to calculate or a different key to exit:
                1- Add
                2- Subtract
                3- Multiplication
                4- Division
                """;
    }
}


