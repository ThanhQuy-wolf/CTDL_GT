import java.lang.IllegalAccessException;
import java.util.Random;

public class Ex6 {
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

    static int findMin(int[] arr) throws IllegalAccessException {
        if (arr == null || arr.length == 0) 
            throw new IllegalAccessException("Array empty!");

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    static int findMax(int[] arr) throws IllegalAccessException {
        if (arr == null || arr.length == 0) 
            throw new IllegalAccessException("Array empty!");

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    static int countEvenNumber(int[] arr) throws IllegalAccessException {
        if (arr == null || arr.length == 0) 
            throw new IllegalAccessException("Array empty!");

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IllegalAccessException {
        Random rd = new Random();
        int[] arr = new int[10];

        arr = createArray(rd, arr);
        printArray(arr);

        System.out.println("Minimum number in arrays is: " + findMin(arr));
        System.out.println("Maximum number in arrays is: " + findMax(arr));
        System.out.println("Count even number in arrays is: " + countEvenNumber(arr));
    }
}
