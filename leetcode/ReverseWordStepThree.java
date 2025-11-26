package leetcode;

import java.util.*;

public class ReverseWordStepThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] word = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i=0;i< word.length;i++){
            StringBuilder sb = new StringBuilder(word[i]);
            sb.reverse();
            builder.append(sb);
            if (i< word.length-1){
                builder.append(" ");
            }
        }
        System.out.println(builder);
    }
}
