package leetcode.math;

import java.util.*;

public class CountTheDigitsThatDivideANumber {
    public static int countDigits(int n){
        int count=0,original=n;
        if (n<=9) return 1;
        List<Integer> set = new ArrayList<>();
        while (n!=0){
            set.add(n%10);
            n/=10;
        }
        for (Integer x : set){
            if (original%x==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = countDigits(n);
        System.out.println(res);
    }
}
