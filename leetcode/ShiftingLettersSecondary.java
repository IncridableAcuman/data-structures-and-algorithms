package leetcode;

import java.util.Scanner;

public class ShiftingLettersSecondary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i=n-2;i>=0;i--){
            for (int j=n-2;j>=0;j--){
                arr[i][j] = (arr[i][j]+arr[i+1][j+1])%26;
            }
        }
        for (int i=0;i<str.length();i++){
            char originalLetters = str.charAt(i);
            char base = 'a';
            int shift = arr[i][i]%26;

            char shifted = (char) (base + (originalLetters - base +shift)%26);
            sb.append(shifted);
        }
        System.out.println(sb);
    }
}
