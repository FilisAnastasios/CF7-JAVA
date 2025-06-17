package gr.aueb.cf.ch4;

/**
 * Special types of for.
 */
public class Ch4_SpecialFor {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 1; i++) {
            System.out.println("Once");
        }

        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + ", " + j);
        }

        for (;;) {
            System.out.println("For Ever"); // den stamataei
            count++;
            if (count == 10) break; // tha stamatisei stis 10 fores
        }
    }
}