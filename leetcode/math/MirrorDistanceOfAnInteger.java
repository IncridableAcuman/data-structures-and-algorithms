package leetcode.math;

import java.util.Scanner;

public class MirrorDistanceOfAnInteger {
    public static int mirrorDistance(int n){
        int original = n,s=0;
        while (n!=0){
            s = s * 10 + n % 10;
            n /= 10;
        }
        return Math.abs(original - s);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = mirrorDistance(n);
        System.out.println(res);
    }
}
