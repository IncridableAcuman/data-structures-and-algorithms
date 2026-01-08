package leetcode.leetcode_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static int[] plusOne(int[] a){
        StringBuilder sb = new StringBuilder();
        int n = a.length;
        int[] res = new int[n];
        for (Integer i : a){
            sb.append(i);
        }
        int t = Integer.parseInt(sb.toString())+1;
        int j=0;
        while (t != 0){
            res[j++]=t%10;
            t/=10;
        }
        return res;
    }
    public static int[] currentPlusOne(int[] a){
        int n = a.length;
        for (int i=n-1;i>=0;i--){
            a[i]++;
            if (a[i]<10){
                return a;
            }
            a[i]=0;
        }
        int[] newDigit = new int[n+1];
        newDigit[0]=1;
        return newDigit;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(currentPlusOne(a)));
    }
}
