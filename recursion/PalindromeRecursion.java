package recursion;

import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (isPalindrome(str)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean isPalindrome(String str){
        return isPal(str,0,str.length()-1);
    }
    public static boolean isPal(String str,int left,int right){
        if (left>=right) return true;
        if (str.charAt(left)!=str.charAt(right)) return false;
        return isPal(str,left+1,right-1);
    }
}
