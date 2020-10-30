package BaiTap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1;
        int[] arr2;
        int [] arr3;
        arr1 = new int[3];
        arr2 = new int[4];
        arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        while (i < arr1.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
            i++;
        }
        int  j = 0;
        while (j < arr2.length) {
            System.out.println("Enter element " + (j + 1) + ": ");
            arr2[j] = scanner.nextInt();
            j++;
        }

        for(int k = 0; k < arr1.length; k++) {
            arr3[k] = arr1[k];
        }
        int m = 0;
        for(int q = arr1.length; q < arr3.length; q++) {
            arr3[q] = arr2[m];
            m++;
        }
        System.out.println("New array is: ");
        for (int x = 0; x < arr3.length; x++){
            System.out.print(arr3[x] + "\t");
        }
    }
}
