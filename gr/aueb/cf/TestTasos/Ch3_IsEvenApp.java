package gr.aueb.cf.TestTasos;

import java.util.Scanner;

/**
 * Ελέγχει αν ένας ακέραιος
 * είναι άρτιος.
 */

public class Ch3_IsEvenApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;

        System.out.println("Please insert a number (integer)");
        num = scanner.nextInt();

        isEven = (num % 2) == 0;

        System.out.printf("%d is even: %b: ", num, isEven);
    }
}
