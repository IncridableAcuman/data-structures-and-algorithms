package leetcode.leetcode_arrays;

import java.util.Scanner;

public class ConcatenationOfArray {
    public static int[] concatenationOfArray(int[] a){
        int[] b = new int[a.length*2];
        System.arraycopy(a, 0, b, 0, a.length);
        System.arraycopy(a, 0, b, a.length-b.length, a.length);
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        int[] b = concatenationOfArray(a);
        for (Integer integer : b){
            System.out.print(integer+" ");
        }
    }
}
