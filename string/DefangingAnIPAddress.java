package string;

import java.util.Scanner;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = s.replaceAll("\\.","[.]");
        System.out.println(t);
    }
}
