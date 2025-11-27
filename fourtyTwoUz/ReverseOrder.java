package fourtyTwoUz;

import java.util.Scanner;
//https://leetcode.com/problems/reverse-words-in-a-string/description/
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while (i>=0){
            while (i>=0 && s.charAt(i) == ' '){
                i--;
            }
            if (i<0) break;
            int end = i;
            while (i>=0 && s.charAt(i) != ' '){
                i--;
            }
            if (!sb.isEmpty()){
                sb.append(" ");
            }
            sb.append(s, i+1, end+1);
        }
        System.out.println(sb);
    }
}
