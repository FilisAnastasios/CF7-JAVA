package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * na lambanei osn input apo ton xrhsth ena
 * dipsifio akereo kai na upologizei kai na ektiponi to athrisma ton psifion tou.
 * gia paradeigma an o xristis dosei ton akeraio 15, tha pare to apotelesma
 * 1 + 5 = 6
 */


public class DigitsSum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum;
        int sum = 0;

        System.out.println("Dose ena dipsifio aritmo ");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10; // me div 10 pernoume to aristero psifio
        rightDigit = inputNum % 10; // me mod 10 pernoume to dexsio psifio
        sum = leftDigit + rightDigit;

        System.out.printf("inpout num %d, %d + %d = %d",inputNum, leftDigit, rightDigit, sum);

    }
}
