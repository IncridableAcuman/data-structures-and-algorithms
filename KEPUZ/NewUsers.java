package KEPUZ;

import java.util.Scanner;

public class NewUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int w = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int sum1 = a+b+c+d+x+y+z;
        int sum2 = w+i+j+k+l+m+n;
        int tr = sum2/sum1;
        double res = ((double) sum2 /sum1);
        System.out.printf("%.10f",(res-tr)*100);
    }
}
