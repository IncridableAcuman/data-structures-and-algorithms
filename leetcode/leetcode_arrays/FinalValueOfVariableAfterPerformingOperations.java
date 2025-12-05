package leetcode.leetcode_arrays;

import java.util.Scanner;
//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/?envType=problem-list-v2&envId=array

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        int k=0,t=0;
        for (String s : a) {
            if (s.equals("++X") || s.equals("X++")) {
                k++;
            }
        }
        for (String s : a) {
            if (s.equals("--X") || s.equals("X--")) {
                t++;
            }
        }
        if (t>=1 && k==0){
            System.out.println(-1*t);
        } else if (t>k) {
            System.out.println(k-t);
        }
        System.out.println(Math.abs(k-t));
    }
}
