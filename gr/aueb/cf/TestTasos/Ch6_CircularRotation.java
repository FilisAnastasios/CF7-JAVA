
package gr.aueb.cf.ch6;

public class Ch6_CircularRotation {

    public static void main(String[] args) {

    }

    public static int[] doLeftShift(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }

    public static int[] doRightShift(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // το % διοτηονι- kal,ouponi
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }
}