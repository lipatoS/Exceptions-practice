package task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static double cardMoney = 1000;
    static double productPrice;

    public static void main(String[] args) {
        System.out.print("enter the amount to be paid: ");
        Scanner inputDay = new Scanner(System.in);
        try {
            productPrice = inputDay.nextDouble();
            if (cardMoney - productPrice < 0) {
                //видимо я не доконца понял тему trow, я понимаю что надо написать .getmessage()
                //но я не знаю где в таком случае должен находиться trow
                throw new ArithmeticException("not enough money on the card");
                //поэтому я оставлю свой запасной вариант с обычным принтом без искилючения
//                System.out.println("not enough money on the card");
            } else System.out.printf("payment successful\ncard balance: %s", cardMoney - productPrice);
        } catch (InputMismatchException e) {
            System.out.println("Error! enter the numbers.");
        }
    }
}