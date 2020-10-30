package BaiTap;

public class ThemVaoMang {
    public static void main(String[] args) {
        int[] value = {10,4,6,7,8,6,0,0,0,0};
        int[] newArray = pushArray(value,2,4);
        for (int k = 0; k < newArray.length; k++)
            System.out.print(newArray[k] + " ");
    }

    public static int[] pushArray(int[]array, int x, int index){
        if (index < 0 || index > array.length)
            System.out.println("k có vị trí này trong mảng");
        else{
            for(int i = array.length - 1; i > index ; i--){
                array[i] = array[i-1];
            }
            array[index] = x;
        }
        return array;
    }
}
