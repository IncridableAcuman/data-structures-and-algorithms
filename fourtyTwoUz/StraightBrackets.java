package fourtyTwoUz;

import java.util.Scanner;

public class StraightBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k=0,t=0;
        for (int i=0;i<str.length();i++){
            if (str.contains("(")){
                k++;
            }
            if (str.contains(")")){
                t++;
            }
        }
        System.out.println(k);
        System.out.println(t);
    }
}
