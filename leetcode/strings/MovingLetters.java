package leetcode.strings;

import java.util.Scanner;

public class MovingLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++){
            char originalChar = str.charAt(i);
            if (Character.isLetter(originalChar)){
                char base = Character.isLowerCase(originalChar) ? 'a' : 'A';
                char shiftedLetter = (char) (base + (originalChar - base +1)%26);
                sb.append(shiftedLetter);
            } else {
                sb.append(originalChar);
            }
        }
        System.out.println(sb);
    }
}
