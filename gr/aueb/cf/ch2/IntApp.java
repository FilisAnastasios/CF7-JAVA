package gr.aueb.cf.ch2;

/**
 * Emfanizei tous tipous dedomenon akeraion
 * int, byte, short..
 * kai to rage (min, max)
 */
public class IntApp {
    public static void main(String[] args){
        System.out.printf("int. Size: %d, Min: %,d, Max: %,d\n", Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("byte. Size: %d, Min: %d, Max: %d\n", Byte.BYTES  * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Short. Size: %d, Min: %d, Max: %d\n", Byte.BYTES  * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Long.  Size: %d, Min: %,d, Max: %,d\n", Byte.BYTES  * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
// to koma mas dixnei tis xiliades
    }
}
