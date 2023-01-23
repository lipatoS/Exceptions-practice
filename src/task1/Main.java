package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner inputNum = new Scanner(System.in);
        try {
            inputNum.nextInt();
            System.out.println("OK");

        } catch (InputMismatchException e) {
            System.out.println("Error! enter the number.");
        }
    }

}


