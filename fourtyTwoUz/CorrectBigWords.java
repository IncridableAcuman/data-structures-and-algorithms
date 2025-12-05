package fourtyTwoUz;

import java.util.Scanner;
// https://42.uz/course/arena/togri-katta-harflar/masala
public class CorrectBigWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int k=0,t=0;
        for (int i=0;i<str.length();i++){
            if (Character.isLowerCase(str.charAt(i))){
                k++;
            }
            if (Character.isUpperCase(str.charAt(i))){
                t++;
            }
        }
        if (Character.isUpperCase(str.charAt(0)) && str.substring(1).equals(str.substring(1).toLowerCase()) ){
            System.out.println(true);
        } else System.out.println(k == str.length() || t == str.length());
    }
}
