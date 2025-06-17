package gr.aueb.cf.TestTasos;

import java.util.Scanner;

public class Ch2_ScannerAddApp {

    public static void main(String[] args) {

// dilosi kai arxikopoiisi metabliton
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // entoles
        System.out.println("Please insert two integer");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        // ektiposi
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με %d", num1, num2, sum);
    }
}
