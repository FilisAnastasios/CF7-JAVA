package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args){
        int inputEuros = 0;
        int totalUsaCent = 0;
        int usaDollars = 0;
        int useCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an integer amount (Euro)");
        inputEuros = in.nextInt();

        totalUsaCent = inputEuros * PARITY;
        usaDollars = totalUsaCent / 100;
        useCents = totalUsaCent % 100;

        System.out.printf("%d euro = %d usa dollars , %d usa cents", inputEuros, usaDollars, useCents);
    }

}
