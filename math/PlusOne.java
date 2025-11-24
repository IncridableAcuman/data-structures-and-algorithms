package math;

import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        int x = a[a.length-1];
        int y = a[a.length-1]+1;

        for (Integer i:a){
            System.out.print(a[i]+" ");
        }
    }
}
