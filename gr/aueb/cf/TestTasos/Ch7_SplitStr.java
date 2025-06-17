package gr.aueb.cf.cf7;

public class Ch7_SplitStr {

    public static void main(String[] args) {
        String s = "Athens Uni    of Econ   and Business";

        String[] tokens = s.split("\\s+");

        for (String token : tokens) {
            System.out.print(token + " ");
        }
    }
}