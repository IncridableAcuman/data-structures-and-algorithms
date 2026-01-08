package leetcode.leetcode_arrays;

import java.util.Scanner;

public class MinimumElementAfterReplacementWithDigitSum {
    public static int sumDigit(int n){
        int sum = 0;
        while (n!=0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public static int minElement(int[] arr){
        int[] numbers = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            numbers[i] = sumDigit(arr[i]);
        }
        int minElement = numbers[0];
        for (Integer num : numbers){
            if (minElement > num){
                minElement = num;
            }
        }
        return minElement;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
       for (int i=0;i<n;i++){
           arr[i] = scanner.nextInt();
       }
       int res = minElement(arr);
        System.out.println(res);
    }
}
