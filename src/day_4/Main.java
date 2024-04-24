package day_4;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the calculator");
        Calculator calculator = new Calculator();
        CalculatorWithMenu calc = new CalculatorWithMenu(calculator);
        boolean aux;
        do {
            calc.showMenu();
            aux = calc.executeOperation();
        }while (aux);
        System.out.println("Exiting the program...");
    }
}
