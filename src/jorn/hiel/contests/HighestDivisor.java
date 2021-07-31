package jorn.hiel.contests;

import java.util.Scanner;

public class HighestDivisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = number;
        if (number>=2 && number<=1000) {

            for (int x = 10; x>= 1; x--) {
                if (number % x == 0) {
                    result = x;
                    break;
                }

            }

            System.out.println(result);
        }
    }






}
