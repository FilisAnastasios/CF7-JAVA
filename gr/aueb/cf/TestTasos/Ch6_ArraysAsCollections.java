package gr.aueb.cf.ch6;

public class Ch6_ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {1, 11, 21, 31, 7, 8, 9};
    }


    // Filtering
    public static int[] getEvens(int[] arr) {
        int count = 0;
        int pivot = 0;

        //tipos gia tous artiousa
        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        for (int el : arr) {
            if (el % 2 == 0)
                evens[pivot++] = el;
        }
        return evens;
    }

    // Mapping
    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    // Reducing
    public static int sum(int[] arr) {
        int sum = 0;

        for (int el : arr) {
            sum += el;
        }

        return sum;
    }

    // briskoume to meso oro
    public static double avg(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    // esto enas artiot(true) allio (false)
    public static boolean anyEven(int[] arr) {
        boolean isAnyEven = false;

        for (int el : arr) {
            if (el % 2 == 0) {
                isAnyEven = true;
                break;
            }
        }
        return isAnyEven;
    }

    // perisoterous apo 2 artious
    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        return count > 2;
    }

    // sinexomenous 3 kai pano p.x. 4,5,6
    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                count++;
                break;
            }
        }
        return count >= 1;
    }

    //an o pinakas exei perisotera apo 2 poy na exoyn ton idio liγonta
    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for (int num : arr) {
            endings[num % 10]++;
        }
        //        for (int i = 0; i < arr.length; i++) {
//            endings[arr[i] % 10]++;
//        }

        for (int count : endings) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    //an oli einai artioi
    public static boolean AllAreEven(int[] arr) {
        //return getEvens(arr).length == arr.length;

        boolean allEven = false;
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        return count == arr.length;
    }

}