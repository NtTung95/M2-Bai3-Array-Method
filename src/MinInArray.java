public class MinInArray {
    public static void main(String[] args) {
        int []arrs = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arrs);
        System.out.println("The smallest element in the array is: " + index);
    }
    public static int minValue(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++)
            if (min > array[i])
                min = array[i];
        return min;
    }
}
