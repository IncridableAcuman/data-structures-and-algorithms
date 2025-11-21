package searching;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] a,int target){
        int n = a.length;
        for (int i=0;i<n;i++){
            if (a[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int result = linearSearch(a,target);
        System.out.println(result);
    }
}
