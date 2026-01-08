package leetcode.strings;

import java.util.Scanner;

public class CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed,String[] words){
        int count = 0;
        String[]  str = new String[allowed.length()];
        for (int i=0;i<allowed.length();i++){
            str[i] = String.valueOf(allowed.charAt(i));
        }
        for (String word : words) {
            for (String st : str){
                if (word.contains(st)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allowed = scanner.next();
        int n = scanner.nextInt();
        String[] words = new String[n];
        for (int i=0;i<n;i++){
            words[i] = scanner.next();
        }
        int result = countConsistentStrings(allowed,words);
        System.out.println(result);
    }
}
