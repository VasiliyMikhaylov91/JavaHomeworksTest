package Lesson003;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSortedArrays {
    public static void main(String[] args) {
        int[] inputArray = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            inputArray[i] = sc.nextInt();
        }
        Arrays.sort(inputArray);
        int[] smallNumbersArray = Arrays.copyOf(inputArray, 10);
        int[] bigNumbersArray = Arrays.copyOfRange(inputArray, 10, 20);
        System.out.println(Arrays.toString(bigNumbersArray));
        System.out.println(Arrays.toString(smallNumbersArray));
    }
}
