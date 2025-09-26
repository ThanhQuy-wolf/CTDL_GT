import java.util.Random;
import java.lang.IllegalAccessException;

public class Ex7 {
    static int[] createArray(Random rd, int[] array) throws IllegalAccessException {
        if (array == null || array.length == 0)
            throw new IllegalAccessException("Array empty!");

        int[] arr = new int[array.length];

        for (int i = 0; i < arr.length; i++) {
            int index = rd.nextInt(100);
            arr[i] = index;
        }

        return arr;
    }

    static void printArray(int[] arr) throws IllegalAccessException {
        if (arr == null || arr.length == 0)
            throw new IllegalAccessException("Array empty!");

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " -> ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    static int findMin(int[] arr, int len) throws IllegalAccessException {
        if (arr == null || len <= 0)
            throw new IllegalAccessException("Array is empty!");

        if (len == 1)
            return arr[0];
        int subMin = findMin(arr, len - 1);
        return Math.min(subMin, arr[len - 1]);
    }

    static int findMax(int[] arr, int len) throws IllegalAccessException {
        if (arr == null || len <= 0)
            throw new IllegalAccessException("Array is empty");

        if (len == 1)
            return arr[0];
        int subMax = findMax(arr, len - 1);
        return Math.max(subMax, arr[len - 1]);
    }

    static int countEvenNumber(int[] arr, int len) throws IllegalAccessException {
        if (arr == null || len <= 0)
            throw new IllegalAccessException("Array is empty!");

        if (len == 1) return (arr[0] % 2 == 0) ? 1 : 0;

        int subCount = countEvenNumber(arr, len - 1);
        return subCount + ((arr[len - 1] % 2 == 0) ? 1 : 0);
    }

    public static void main(String[] args) throws IllegalAccessException {
        Random rd = new Random();
        int[] arr = new int[10];

        arr = createArray(rd, arr);
        printArray(arr);

        System.out.println("Minimum number in arrays is: " + findMin(arr, arr.length));
        System.out.println("Maximum number in arrays is: " + findMax(arr, arr.length));
        System.out.println("Count even number in arrays is: " + countEvenNumber(arr, arr.length));
    }
}
