package jorn.hiel.contests;

import java.util.Scanner;

public class LuckyFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int howMany = scanner.nextInt();

        int[] result = new int[howMany];

        for (int i = 0; i < howMany; i++){
            int number = scanner.nextInt();
            String counter = String.valueOf(number);
            result[i]=   (int) counter.chars().filter(ch -> ch == '4').count();
        }
        for(int x = 0; x<howMany;x++){
            System.out.println(result[x]);

        }


    }
}
