package gr.aueb.cf.ch2;

import java.util.Scanner;
// Scanner demo
public class ScannerAddApp {

    public static void main(String[] args){
        // dilosi kai arxikopiisi
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        // entoles

        System.out.println(" pleaser insert two interers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        System.out.printf("to athrisma ton %d kai %d einai iso %d", num1, num2, sum);
    }
}
