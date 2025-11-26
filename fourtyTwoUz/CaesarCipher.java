package fourtyTwoUz;

import java.util.Scanner;
//https://42.uz/course/arena/sezar-shifri/problem
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int key = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        key = key%26;
        for (int i=0;i<str.length();i++){
             char originalChar = str.charAt(i);
             if (Character.isLetter(originalChar)){
                 char base = Character.isLowerCase(originalChar) ? 'a' : 'A';
                 char shiftedChar = (char) (base + (originalChar - base + key)%26);
                 sb.append(shiftedChar);
             } else{
               sb.append(originalChar);
             }

        }
        System.out.println(sb);
    }
}
