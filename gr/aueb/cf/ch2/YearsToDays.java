package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert years (age) to days.
 */
public class YearsToDays {

    public static void main(String[] args) {
        // dilosi kai arxikopoiisi metabliton
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        // entoles
        System.out.println("Please isert your age");
        age = scanner.nextInt();

        days = age * DAYS_PER_YEAR;

        // ektiposi ton apotelesmaton
        System.out.println("Age in years:" + age + ", age in days: " + days);

    }
}
