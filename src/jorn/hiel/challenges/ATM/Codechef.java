package jorn.hiel.challenges.ATM;


import java.util.Scanner;

public class Codechef {

    public static void main (String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            double transaction = scanner.nextDouble();
            double balance = scanner.nextDouble();
            double transactionCost = 0.5;

            if (transaction > 0 && transaction <= 2000 && transaction % 5 == 0 && (balance >= transaction + transactionCost)) {
                balance -= (transaction + transactionCost);
            }

            System.out.printf("%.2f", balance);


        }
    }
}
