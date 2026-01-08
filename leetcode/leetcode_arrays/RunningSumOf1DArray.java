package leetcode.leetcode_arrays;

import java.util.Scanner;

public class RunningSumOf1DArray {
    public static int[] runningSum(int[] arr) {
        int s=0;
        int[] result = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            s+=arr[i];
            result[i]=s;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int[] result = runningSum(arr);
        for (Integer res : result){
            System.out.print(res+" ");
        }
    }
}
