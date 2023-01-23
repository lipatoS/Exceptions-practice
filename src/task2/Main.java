package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static double[] prices;
    static int inputs;

    public static void main(String[] args) {
        prices = new double[]{11.1, 22.2, 33.3, 44.4, 55.5};
        System.out.println("Enter the number of the day (from 1 to 5) to see the price: ");
        Scanner inputDay = new Scanner(System.in);
        try {
            inputs = inputDay.nextInt() - 1;
            System.out.println(prices[inputs]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! out of range (1 - 5)");
        } catch (InputMismatchException ex) {
            System.out.println("Error! enter the numbers.");
        }
    }
}