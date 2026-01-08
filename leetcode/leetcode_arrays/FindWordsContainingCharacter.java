package leetcode.leetcode_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindWordsContainingCharacter {
    public static List<Integer> findWordsContaining(String[] str,char x){
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<str.length;i++){
            if (str[i].indexOf(x) != -1){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i=0;i<n;i++){
            str[i] = scanner.next();
        }
        char c  = (char) scanner.nextByte();
        List<Integer> res = findWordsContaining(str,c);
        for (Integer re : res) {
            System.out.print(re + " ");
        }
    }
}
