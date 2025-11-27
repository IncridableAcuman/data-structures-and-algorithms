package leetcode;

import java.util.Collections;
import java.util.Scanner;
//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] s = new char[n];
        for (int i=0;i<n;i++){
            s[i] = (char) scanner.nextByte();
        }
    }
    public static void reverseString(char[] s){
        int start=0,end=s.length-1;
        while (start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}
