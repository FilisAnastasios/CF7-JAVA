package gr.aueb.cf.ch2;

public class PrintApp {

    public static void main(String[] args) {
        int day = 8;
        int month = 7;
        int year = 2020;

        System.out.println("Η ημερομηνία είναι: " + day + "/" + month + "/" + year);
        System.out.printf("Η ημερομηνία είναι: %02d/%02d/%d", day, month, year);
        // to %2d desmebi 2 thesis . %02d desmebei 2 thesis kai opou iparxei keno bazei 0
    }
}
