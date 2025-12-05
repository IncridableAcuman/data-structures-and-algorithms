package leetcode.math;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FactoringANumber {
    public static Map<Integer,Integer> factoringANumber(int n){
        Map<Integer,Integer> map = new HashMap<>();
        if (n == 1){
            return new HashMap<>(0,0);
        }
        while (n % 2 == 0){
            map.put(2,map.getOrDefault(2,0)+1);
            n/=2;
        }
        while (n % 3 == 0){
            map.put(3,map.getOrDefault(3,0)+1);
            n/=3;
        }
        for (int i=5;i<=n;i+=6){
            while (n % i == 0){
               map.put(i,map.getOrDefault(i,0)+1);
               n/=i;
            }
            while (n % (i+2) == 0){
                map.put((i+2),map.getOrDefault((i+2),0)+1);
                n/=(i+2);
            }
        }
        if (n>3){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer,Integer> map = factoringANumber(n);
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"^"+entry.getValue());
        }
    }
}
