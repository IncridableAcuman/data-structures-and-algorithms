package fourtyTwoUz;

import java.util.Scanner;

public class LongestPalindromeSubString {
    public static String longestPalindrome(String str){
        int start=0,end=0;
        for (int i=0;i<str.length();i++){
            int len1 = expand(str,i,i);
            int len2 = expand(str,i,i+1);
            int len = Math.max(len1,len2);

            if (len > end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return str.substring(start,end+1);
    }
    private static int expand(String str,int left,int right){
        while (left>=0 && right<str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String res = longestPalindrome(s);
        System.out.println(res);
    }
}
