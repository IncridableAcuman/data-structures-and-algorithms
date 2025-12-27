package leetcode.leetcode_arrays;

import java.util.Scanner;

public class AlternatingDigitSum {
    public static int alternateDigitSum(int n){
        String str = String.valueOf(n);
        int[] x = new int[str.length()];
        int[] y = new int[str.length()];

        for (int i=0;i<str.length();i++){
            int parseInt = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (i%2==1){
                x[i] = parseInt;
            }
            if (i%2==0){
                y[i] = parseInt;
            }
        }
        int sumOne = 0,sumTwo = 0;
        for (Integer i : x){
            sumOne += i;
        }
        for (Integer j : y){
            sumTwo += j;
        }
        return sumOne - sumTwo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(alternateDigitSum(n));
    }
}
