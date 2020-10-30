package BaiTap;

import com.sun.deploy.util.ArrayUtil;

public class XoaMang {
    public static void main(String[] args) {
        int[] value = {10,4,6,7,8,6,0,0,0,0};
        int[] newArray = deleteArray(value,6);
        for (int j = 0; j < newArray.length; j++)
            System.out.print(newArray[j] + " ");
    }
    public static int[] deleteArray(int [] array, int x) {
        for (int i = 0; i < array.length; i++)
                if (array[i] == x)
                    for (int k = i; k < array.length - 1; k++)
                        array[k] = array[k+1];
                    array[array.length-1] = 0;
        return array;
    }
}
