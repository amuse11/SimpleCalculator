import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void menu() {
        boolean secondMenuWhile = false;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What operation would you like to do?\n");
            System.out.println("Please type 1 to choose from the second menu of Addition, Subtraction, Multiplication or Division otherwise,\n");
            System.out.println("Exponential (Type 2 into console)\n");
            System.out.println("Exit the program (Type 3 into console)");
            int menuChoiceInt = 0;
            try {
                menuChoiceInt = sc.nextInt();

            } catch (InputMismatchException ime) {
                System.out.println("Please input an integer");
                sc.nextLine();
            }
            if (menuChoiceInt == 1) {
                while (!secondMenuWhile) {
                    System.out.println("What's the first number?");
                    double firstNumber = 0;
                    try {
                        firstNumber = sc.nextDouble();

                    } catch (InputMismatchException ime) {
                        System.out.println("Please input a number");
                        sc.nextLine();
                    }
                    System.out.println("What's the second number?");
                    double secondNumber = 0;
                    try {
                        secondNumber = sc.nextDouble();

                    } catch (InputMismatchException ime) {
                        System.out.println("Please input a number");
                        sc.nextLine();
                    }
                    System.out.println("What's the operation you wish to do?");
                    System.out.println("Type 1 to do addition of the two numbers");
                    System.out.println("Type 2 to do the subtraction of the two numbers from each other");
                    System.out.println("Type 3 to multiply the two numbers");
                    System.out.println("Type 4 to divide the first number by the second");
                    System.out.println("Type 5 to exit this second menu");
                    int secondMenuChoiceInt = 0;
                    try {
                        secondMenuChoiceInt = sc.nextInt();

                    } catch (InputMismatchException ime) {
                        System.out.println("Please input an integer");
                        sc.nextLine();
                    }
                    if (secondMenuChoiceInt == 1) {
                        System.out.println("The answer is: " + Addition.Addition(firstNumber, secondNumber) +"\n");
                    } else if (secondMenuChoiceInt == 2) {
                        System.out.println("The answer is: " + Subtraction.Subtraction(firstNumber, secondNumber) +"\n");
                    } else if (secondMenuChoiceInt == 3) {
                        System.out.println("The answer is: " + Multiplication.Multiplication(firstNumber, secondNumber) +"\n");
                    } else if (secondMenuChoiceInt == 4) {
                        System.out.println("The answer is: " + Division.Division(firstNumber, secondNumber) +"\n");
                    } else if (secondMenuChoiceInt == 5) {
                        System.out.println("You are now going back to the first menu");
                        secondMenuWhile = true;
                    } else {
                        System.out.println("Please try again\n");
                    }
                }
            } else if (menuChoiceInt == 2) {
                System.out.println("What's the base?");
                double baseNumber = 0;
                try {
                    baseNumber = sc.nextDouble();

                } catch (InputMismatchException ime) {
                    System.out.println("Please input a number");
                    sc.nextLine();
                }
                System.out.println("What's the exponent?");
                double exponentNumber = 0;
                try {
                    exponentNumber = sc.nextDouble();

                } catch (InputMismatchException ime) {
                    System.out.println("Please input a number");
                    sc.nextLine();
                }
                System.out.println("The answer is: " + Exponent.Exponent(baseNumber, exponentNumber) +"\n");
            } else if (menuChoiceInt == 3) {
                System.out.println("Thanks for using my calculator!\n");
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Please try again\n");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }

}
