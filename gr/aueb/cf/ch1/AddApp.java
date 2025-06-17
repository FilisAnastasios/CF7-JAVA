package gr.aueb.cf.ch1;

public class AddApp {

    public static void main(String[] args) {
        // δήλωση και Αρχικοποίηση μεταβλητων
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        result = num1 + num2;

        System.out.println("to apotelesma einia :" + result);
        System.out.println("to athrisma einai: " + num1 + ", " + num2 + " ειnai " + result);
        System.out.printf("το ατηρισμα των %d, %d einai iso me %d\n", num1, num2, result);
    }
}
