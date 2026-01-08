package leetcode.leetcode_arrays;

import java.util.Scanner;

public class StrictlyPalindromicNumber {
    public static boolean isEquals(int n){
        int original = n;
        int reverse = 0;
        int remainder;
        while (n != 0){
            remainder = n%10;
            reverse = reverse * 10 + remainder;
            n/=10;
        }
        return original == reverse;
    }
    public static boolean isStrictlyPalindromic(int n){
        String binaryString = Integer.toBinaryString(n);
        int binaryNumber = Integer.parseInt(binaryString);
        boolean original = isEquals(binaryNumber);
        boolean sqrt = isEquals((int) Math.sqrt(binaryNumber));
        return original && sqrt;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean res = isStrictlyPalindromic(n);
        System.out.println(res);
    }
}
