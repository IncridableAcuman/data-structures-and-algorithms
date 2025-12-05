package robocontest;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        int n = z >0 ? z : -z,k=0;
        int res = 0;
        if (z==0){
            System.out.println(-1);
        } else {
            for (int i=1;i*i<=n;i++){
                if (n%i==0) k++;
                if (i*i != n) k++;
            }
            if (k%2==1 && z>0){
                res=k+1;
            } else {
                res=k;
            }
            System.out.println(res);
        }
    }
}
