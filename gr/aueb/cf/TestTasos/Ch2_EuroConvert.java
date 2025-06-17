package gr.aueb.cf.TestTasos;

import java.util.Scanner;

public class Ch2_EuroConvert {

    public static void main(String[] args) {

        int inputEuros = 0;
        int totalUseCents = 0;
        int usaDollars = 0;
        int useCents = 0;
        final int PARITY = 98;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an interer amount (Euro)");
        inputEuros = in.nextInt();

        totalUseCents = inputEuros * PARITY;
        usaDollars = totalUseCents / 100;
        useCents = totalUseCents % 100;

        System.out.printf("%d euro = %d usa dollars , %d usa cents\n", inputEuros, usaDollars, useCents );
        // ektiposi me simbola
        System.out.printf("%d \u20AC = %d \u0024 , %d usa cents", inputEuros, usaDollars, useCents);
    }
}
