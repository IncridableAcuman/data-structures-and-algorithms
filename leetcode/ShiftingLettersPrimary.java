package leetcode;

import java.util.Scanner;

public class ShiftingLettersPrimary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for (int i=n-2;i>=0;i--){
            arr[i] = (arr[i] + arr[i+1])%26;
        }
        for (int i=0;i<str.length();i++){
            char originalChar = str.charAt(i);
            char base = 'a';
            int shift = arr[i] % 26;

            char shifted = (char) (base + (originalChar - base +shift)%26);
            sb.append(shifted);
        }
        System.out.println(sb);
    }
}
