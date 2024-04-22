package dia_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ej1
//        String myName = "Joaquin";
//        String myLastName = "Neulist";
//        Byte myAge = 19;
//        System.out.println("My name is " + myName + " " + myLastName + " and my age is " + myAge);
        //Ej2
//        Scanner scanner = new Scanner(System.in);
//        String welcomeMsg = "Welcome to intellij";
//        String firstName;
//        firstName = scanner.next();
//        System.out.println(welcomeMsg +" "+ firstName);
        //Ej3
//        Scanner scanner = new Scanner(System.in);
//        Integer num1;
//        Integer num2;
//        Integer num3;
//        num1 = scanner.nextInt();
//        num2 = scanner.nextInt();
//        num3 = scanner.nextInt();
//        if (num1 > num2 && num1 > num3){
//            System.out.println("The largest number is: "+num1);
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("The largest number is: "+num2);
//        } else if (num3 > num1 && num3 > num2){
//            System.out.println("The largest number is: "+num3);
//        } else {
//            System.out.println("There are numbers that are equals");
//        }
        //ej4
//        Scanner scanner = new Scanner(System.in);
//        Integer num;
//        num = scanner.nextInt();
//        if (num%2 == 0){
//            System.out.println("The number "+num+" is even");
//        }else{
//            System.out.println("The number "+num+" is odd");
//        }
        //ej5
//            Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a String of characters");
//        String cadena1 = scanner.nextLine();
//        System.out.println("Enter a Second string of characters");
//        String cadena2 = scanner.nextLine();
//        if (cadena1.contentEquals(cadena2)){
//            System.out.println("The strings are the same "+cadena1);
//        }else {
//            System.out.println("The strings are not the same "+cadena1+" and "+cadena2);
//        }
        //ej6
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        boolean isPrime = false;
//        if (num <= 1) {
//            isPrime = false;
//        } else {
//            isPrime = true;
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime) {
//            System.out.println("The number "+num + " is prime.");
//        } else {
//            System.out.println("The number "+num + " is not prime.");
//        }
        //Ej 7
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the numbers of elements : ");
//        int n = scan.nextInt();
//        int[] numbers = new int[n];
//        System.out.println("Enter the numbers : ");
//        for(int i = 0; i < n; i++){
//            numbers[i] = scan.nextInt();
//        }
//        int sumOddNumbers = sumOddNumbers(numbers);
//        System.out.println("The sum of odd numbers is : "+sumOddNumbers);
        //8
//        int[] numbers = {3, 4, 5, 6, 7, 8, 9, 10};
//        int sumEvenAndPrime = sumEvenAndPrime(numbers);
//        System.out.println("Sum of even and prime numbers : "+sumEvenAndPrime);
//    }
//
//    public static int sumEvenAndPrime(int[] numbers) {
//        int sum = 0;
//        for (int num : numbers) {
//            if (isEven(num) || isPrime(num)) {
//                sum += num;
//            }
//        }
//        return sum;
//    }
//
//    public static boolean isEven(int num) {
//        return num % 2 == 0;
//    }
//
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i * i <= num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
    //ej9 y 10
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter 2 numbers");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int choice;
//        do{
//            System.out.println("Calculator menu");
//            System.out.println("1. Add");
//            System.out.println("2. Subtrat");
//            System.out.println("3. Multiply");
//            System.out.println("4. Divide");
//            System.out.println("0. Exit");
//            System.out.println("Enter your choice: ");
//        choice = scan.nextInt();
//        switch (choice){
//            case 1:
//                System.out.println("You chose to add.");
//                int sum = num1+num2;
//                System.out.println(num1+"+"+num2+"="+sum);
//                break;
//            case 2:
//                System.out.println("You chose to subtract.");
//                int subtract = num1-num2;
//                System.out.println(num1+"-"+num2+"="+subtract);
//                break;
//            case 3:
//                System.out.println("You chose to multiply.");
//                int product = num1*num2;
//                System.out.println(num1+"*"+num2+"="+product);
//                break;
//            case 4:
//                if (num2 == 0){
//                    System.out.println("You cant divide by 0");
//                }
//                else{
//                System.out.println("You chose to divide.");
//                int division = num1/num2;
//                System.out.println(num1+"/"+num2+"="+division);
//                }
//                break;
//            case 0:
//                break;
//            default:
//                System.out.println("Invalid choice. Please enter a valid option.");
//                break;
//        }
//        }while (choice != 0);
    //ej11 y 12
        Scanner scan = new Scanner(System.in);
        int availableCapacity = 500;
        double moneyRaised = 0.0;
        int choice;
        do {
            System.out.println("Welcome to la bolera.");
            System.out.println("1. Data entry.");
            System.out.println("2. Available capacity.");
            System.out.println("3. Money raised.");
            System.out.println("4. Log out.");
            System.out.println("Chose your option:");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter your age:");
                    int age = scan.nextInt();
                    System.out.println("Enter your id");
                    String id = scan.next();
                    System.out.println("Enter your name");
                    String name = scan.next();
                    System.out.println("What pass do you have:");
                    String pass = scan.next();
                    if (age < 21){
                        System.out.println("Sorry, only persons over 21 years old are allowed entry.");
                        return;
                    }
                    double ticketPrice = 1500.0;
                    if (pass.equalsIgnoreCase("VIP")) {
                        System.out.println("Welcome VIP! Your entry is free.");
                    } else if (pass.equalsIgnoreCase("Discount")) {
                        System.out.println("Welcome with discount! Your ticket is half price.");
                        ticketPrice /= 2;
                    } else {
                        System.out.println("Pass type not recognized. Regular ticket price will be charged.");
                    }
                        System.out.print("Do you want to buy a regular (R) or VIP (V) ticket? ");
                        String ticketType = scan.next();
                        if (ticketType.equalsIgnoreCase("V")) {
                            ticketPrice = 2000.0; //
                            System.out.println("Welcome VIP. Thank you for your purchase.");
                        } else {
                            System.out.println("Welcome. Thank you for your purchase.");
                        }
                        moneyRaised += ticketPrice;
                        availableCapacity--;
                        System.out.println("Enjoy your time at the bowling alley.");
                    break;
                case 2:
                    System.out.println("Available capacity: "+availableCapacity);
                    break;
                case 3:
                    System.out.println("Money raised: $"+moneyRaised);
                    break;
                case 4:
                    System.out.println("You_log_out.");
                    break;
                default:
                    System.out.println("Jimmy option"); //South park reference
                    break;
            }
        }while (choice!=4);
    }
}
