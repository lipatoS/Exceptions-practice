package task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int minTemperature;
    static int maxTemperature;
    static int currentTemperature;

    public static void main(String[] args) {
        minTemperature = -10;
        maxTemperature = 35;
        System.out.print("enter temperature: ");
        Scanner inputTemperature = new Scanner(System.in);
        try {
            currentTemperature = inputTemperature.nextInt();
            if (minTemperature <= currentTemperature && currentTemperature <= maxTemperature) {
                System.out.println("Normal temperature");
            } else System.out.println("Temperature error!");

        } catch (InputMismatchException e) {
            System.out.println("Error! enter the numbers.");
        }

    }
}
