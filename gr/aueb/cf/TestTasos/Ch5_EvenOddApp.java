package gr.aueb.cf.ch5;


public class Ch5_EvenOddApp {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num + " is even: " + isEven(num));
        System.out.println(num + " is odd: " + isOdd(num));
    }

// perots
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Delegation Design Pattern.
     *
     * @param num
     * @return
     */
    //artios
    public static boolean isOdd(int num) {
        return !isEven(num);
    }
}