package BaiTap;

import java.util.Scanner;

public class TongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][];
        int size;
        System.out.println("Enter a size of arr: ");
        size = scanner.nextInt();

        arr = new int[size][size];
        int i = 0, j = 0;

        while (i < size) {
            while (j < size) {
                System.out.println("Enter element " + (j + 1) + " in arr[" + (i + 1) + "]: ");
                arr[i][j] = scanner.nextInt();
                j++;
            }
            j = 0;
            i++;
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int m = 0; m < size; m++) {
            for (int n = 0; n < size; n++) {
                if (m == n) {
                    sum1 += arr[m][n];
                }
                if (m + n == size - 1) {
                    sum2 += arr[m][n];
                }
            }
        }
        System.out.println("Tổng chéo của mảng là: " + sum1 + " và " + sum2);
    }
}
