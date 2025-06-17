package gr.aueb.cf.TestTasos;

/**
 * Ti kanei auti i klasi
 */

public class Ch1 {

    public static void main(String[] args) {
        /*
         * block komens
         */

        // siloseis kai arxikopoiisi metabliton
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //Entoles
        result = num1 + num2;

        System.out.println("Hello World!");
        System.out.print("Tasos");
        System.out.println(); // lite komens
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το άθροισμα των " + num1 + ", " + num2 + " είναι ισο με: " + result);
        System.out.printf("Το άθροισμα των %d , %d είναι ίσο με: %d", num1, num2, result);
                                                             //  Ta parakato einai raper klasis giauto ksekinane me kefaleo
        System.out.printf("int. Size: %d, Min: %,d, Max: %,d\n", Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("byte. Size: %d, Min: %d, Max: %d\n", Byte.BYTES  * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Short. Size: %d, Min: %d, Max: %d\n", Byte.BYTES  * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Long.  Size: %d, Min: %,d, Max: %,d\n", Byte.BYTES  * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }
}
