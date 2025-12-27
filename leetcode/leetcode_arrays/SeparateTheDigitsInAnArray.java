package leetcode.leetcode_arrays;

import java.util.Scanner;

public class SeparateTheDigitsInAnArray {
    public static int[] separateDigits(int[] a){
        StringBuilder str= new StringBuilder();
        for (int j : a) {
            str.append(j);
        }
        int[] ar = new int[str.length()];
        for (int i=0;i<str.length();i++){
            ar[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return ar;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a  = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] res = separateDigits(a);
        for (Integer integer : res){
            System.out.print(integer+" ");
        }
    }
}
