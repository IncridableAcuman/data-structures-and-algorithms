package leetcode.math;

import java.util.Scanner;

public class IntegerToRoman {
    public static String IntegerToRomanNumeral(int n){
        String[] M = {"","M","MM","MM"};
        String[] C = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] X = {"","X","XX","XXX","XL","L","LX","LII","LXXX","XC"};
        String[] I = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

        return M[n/1000] + C[(n%1000)/100] + X[(n%100)/10] + I[n%10];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(IntegerToRomanNumeral(n));
    }
}
