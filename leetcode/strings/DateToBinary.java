package leetcode.strings;

import java.util.Scanner;

public class DateToBinary {
    public static String convertDateToBinary(String date){
        String[] convert = date.split("-");
        return toBinary(Integer.parseInt(convert[0])) + "-" + toBinary(Integer.parseInt(convert[1])) + "-" + toBinary(Integer.parseInt(convert[2]));
    }
    public static String toBinary(int n){
       return Integer.toBinaryString(n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String s = scanner.next();
        int n = scanner.nextInt();
        System.out.println(toBinary(n));
    }
}
