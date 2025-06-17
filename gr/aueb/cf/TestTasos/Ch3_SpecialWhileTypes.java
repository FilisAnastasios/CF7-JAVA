package gr.aueb.cf.TestTasos;

import java.util.Scanner;

public class Ch3_SpecialWhileTypes {

    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        int num;

        // katanaloni olous tous + kai ftani ston proto -

        while ((num = in.nextInt()) >= 0);

        while (i <= 0) {
            System.out.println("Never gets in");
            i++;
        }

        while (i < 1) {
            System.out.println("Never gets in");
            i++;
        }

        while (i <= 1) {
            System.out.println("One time gets in");
            i++;
        }

        while (true) {
            System.out.println("Eternal loop");
        }


    }
}
