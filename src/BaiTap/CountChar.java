package BaiTap;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi");
        String alpha = scanner.nextLine();
        System.out.println("Nhập 1 ký tự");
        String x = scanner.nextLine();
        System.out.println(countChar(alpha, x));
    }
    public static int countChar(String a, String b){
        int count = 0;
        for(int i = 0; i < a.length(); i++){
            if (a.charAt(i) == b.charAt(0)){
                count++;
            }
        }
        return count;
    }
}
