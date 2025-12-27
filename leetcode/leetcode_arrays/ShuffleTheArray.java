package leetcode.leetcode_arrays;

import java.util.Scanner;

public class ShuffleTheArray {
    public static int[] shuffleTheArray(int[] a,int n){
        int[] res = new int[2*n];
        for (int i=0;i<n;i++){
            a[2*i] = a[i];
            a[2*i+1] = a[i+n];
        }
        return  res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = shuffleTheArray(a,m);
        for (Integer i : b){
            System.out.print(i+" ");
        }
    }
}
