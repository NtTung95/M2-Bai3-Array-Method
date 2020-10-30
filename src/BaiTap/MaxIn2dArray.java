package BaiTap;

import java.util.Scanner;

public class MaxIn2dArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][];
        int size1;
        int size2;
        System.out.println("Enter a size of arr: ");
        size1 = scanner.nextInt();
        System.out.println("Enter a size of arr[i]: ");
        size2 = scanner.nextInt();

        arr = new int[size1][size2];
        int i = 0, j = 0;

        while (i < size1) {
            while (j < size2) {
                System.out.println("Enter element " + (j+1) + " in arr[" + (i + 1) + "]: ");
                arr[i][j] = scanner.nextInt();
                j++;
            }
            j = 0;
            i++;
        }
        int max = arr[0][0];
        for (int k = 0; k < arr.length; k++)
            for(int n = 0; n < arr[k].length; n++)
                if (max < arr[k][n]) {
                    max = arr[k][n];
                }
        System.out.println("Max in arr is: " + max);
    }
}
