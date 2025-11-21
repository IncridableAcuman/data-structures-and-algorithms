package math;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int greatestCommonDivisor(int a,int b){
        while (b!=0){
            if (a>b){
                a%=b;
            }else {
                b%=a;
            }
            if (a==0) a=b;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b=scanner.nextInt();
        int result=greatestCommonDivisor(a,b);
        System.out.println(result);
    }
}
