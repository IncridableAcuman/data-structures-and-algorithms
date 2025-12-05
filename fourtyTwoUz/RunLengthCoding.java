package fourtyTwoUz;

import java.util.Scanner;

public class RunLengthCoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i=0;i<n;i++){
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            while (count>9){
                count-=9;
                sb.append(9).append(str.charAt(i));
            }
            sb.append(count).append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
