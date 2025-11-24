package KEPUZ;
// https://kep.uz/practice/problems/problem/2107
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumKEPpyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int place = 1,count = 0;
        if (n<100){
            String regex = "^[1-9]0*$";
            Pattern pattern = Pattern.compile(regex);
            String str = String.valueOf(n);
            Matcher matcher = pattern.matcher(str);

                if (matcher.matches()){
                    count=1;
                    System.out.println(count);
                    System.out.println(str);
                }
        } else {
            List<Integer> list = new ArrayList<>();
            int temp=n;
            while (temp>0){
                int digit = temp%10;
                if (digit != 0){
                    list.add(digit*place);
                    count++;
                }
                temp/=10;
                place*=10;
            }
            System.out.println(count);
            for (Integer i : list){
                System.out.print(i+" ");
            }
        }

    }
}
