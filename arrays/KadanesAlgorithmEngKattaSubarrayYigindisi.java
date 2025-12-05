package arrays;

import java.util.Scanner;

public class KadanesAlgorithmEngKattaSubarrayYigindisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int maxStart = arr[0];
        int maxEnd = arr[0];
        for (int i=1;i<arr.length;i++){
            maxEnd = Math.max(arr[i],maxEnd+arr[i]);
            maxStart = Math.max(maxStart,maxEnd);
        }
        System.out.println(maxEnd);
    }
}
