package leetcode.leetcode_arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class ComputeAlternatingSum {
    public static int alternatingSum(int[] a){
        int n = a.length;
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i=0;i<n;i++){
            if(i%2==1){
                x[i] = a[i];
            }
            if(i%2==0){
                y[i] = a[i];
            }
        }
        int sumOne=0,sumTwo=0;
        for (Integer i : x){
            sumOne+=i;
        }
        for (Integer j : y){
            sumTwo+=j;
        }
        return sumOne - sumTwo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a  = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        String s="12344556";
        System.out.println(a);
    }
}
