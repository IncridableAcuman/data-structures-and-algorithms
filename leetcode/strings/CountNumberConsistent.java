package leetcode.strings;

import java.util.Scanner;

public class CountNumberConsistent {
    public static int countConsistentStrings(String allowed,String[] words){
        int k=0;
        for (int i=0;i<= words.length - allowed.length();i++){
            if (words[i].contains(allowed)){
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allowed = scanner.next();
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i=0;i<n;i++){
            strings[i] = scanner.next();
        }
        int res = countConsistentStrings(allowed,strings);
        System.out.println(res);
    }
}
