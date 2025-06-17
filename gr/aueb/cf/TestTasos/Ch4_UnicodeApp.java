package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demo of surrogate pairs.
 */
public class Ch4_UnicodeApp {

    public static void main(String[] args) {
        int codePoint = 0x1F600; //nowsms.com/download/emoticons.html

        System.out.println("Smile: \uD83D\uDE03");// metatropi- russellcottrell.com/greek/utilities/SurrogatesPairCalculator.html
        System.out.print("Smiley: ");
        System.out.println(Character.toChars(codePoint)); // mporoume kai me tin sigkekrimeni klasi
    }
}