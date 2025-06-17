package gr.aueb.cf.TestTasos;

public class Ch3_SumMulWhile {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int sum = 0;
        int mul = 1;

        while (i <= 10) {
            // sum = sum + i;
            sum += i;
            i++;
        }

        while (j <= 10) {
            mul = mul * j;
            j++;
        }
    }
}
