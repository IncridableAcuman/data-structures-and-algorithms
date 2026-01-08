package KEPUZ;

import java.util.Scanner;

public class YopishqoqKetmaKetlik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[]{1,12,123,1234,12345,123456,12345678,123456789};
        StringBuilder sb = new StringBuilder();
        long  t=0;
        for (int i=0;i<n;i++){
            sb.append(i);
            t+=Integer.parseInt(String.valueOf(sb));
        }
        System.out.println(t);
    }
}
