package BaiTap;

import java.util.Scanner;

public class SumOfColumn {
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
                System.out.println("Enter element " + (j + 1) + " in arr[" + (i + 1) + "]: ");
                arr[i][j] = scanner.nextInt();
                j++;
            }
            j = 0;
            i++;
        }
        System.out.println("Enter index of column: ");
        int x = scanner.nextInt();
        int sumOfColumn = 0;
        for(int column = 0; column < size2; column++)
            for(int row = 0; row < size1; row++)
                if (column == x)
                    sumOfColumn += arr[row][x];
        System.out.println("Sum of column " + x + ": " + sumOfColumn);
    }
}
