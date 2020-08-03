package digitsum;

import java.util.Scanner;

public class DigitSum {

    private static Scanner s = new Scanner(System.in);

    public static void run() {
        int input;
        System.out.print("Enter a non negative integer:\n");
        input = s.nextInt();
        sum(inputCheck(input));
    }

    private static void sum(int num) {
        int summary = 0;
        if (String.valueOf(num).length() == 1) System.out.printf("Final summary of digits is: %d", num);
        else {
            while (num > 0) {
                while (num > 0) {
                    summary = summary + num % 10;
                    num = num / 10;
                }
            }
            sum(summary);
        }
    }

    private static int inputCheck (int input) {
        if (isPositive(input)) return input;
        else {
            System.out.print("Please, enter non negative number:\n");
            input = s.nextInt();
            return inputCheck(input);
        }
    }


    private static boolean isPositive (int input) {
        return input > 0;
    }
}
