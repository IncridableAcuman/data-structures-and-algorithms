package fourtyTwoUz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//https://leetcode.com/problems/reverse-words-in-a-string/description/
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ar = s.trim().split(" ");
        Collections.reverse(Arrays.asList(ar));
        StringBuilder sb = new StringBuilder();
        for (int i=0;i< ar.length;i++){
            sb.append(ar[i]);
            if (i<ar.length-1){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
