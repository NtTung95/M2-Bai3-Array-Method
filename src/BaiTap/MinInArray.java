package BaiTap;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[];
        int size;
        System.out.println("Enter a size: ");
        size = scanner.nextInt();
        arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.println("Enter element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int min = arr[0];
        for (int j = 1; j < arr.length; j++)
            if (min > arr[j])
                min = arr[j];

        System.out.println("Min in array is: " + min);
    }
}
