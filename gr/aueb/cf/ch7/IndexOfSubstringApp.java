package gr.aueb.cf.cf7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");  // 1
        int positionOfSecondo = cf.indexOf("o", 2);// apo tin thesi 2 kai meta
        int lastPositionOfo = cf.lastIndexOf("o");

        String cf2 = cf.substring(1);   // "oding Factory"
        String slice = cf.substring(1, 3); // od
    }
}