package fourtyTwoUz;

import java.util.Scanner;

public class StraightBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k=0,t=0;
        for (int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            if (currentChar == '('){
                k++;
            } else {
                break;
            }
        }
        for (int j=str.length()-1;j>=0;j--){
            char currentChar = str.charAt(j);
            if (currentChar == ')'){
                t++;
            } else {
                break;
            }
        }
        System.out.println(k==t);
    }
}
