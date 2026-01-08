package leetcode.leetcode_arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheTwoSneakyNumbersOfDigitville {
    public static int[] getSneakyNumbers(int[] arr){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int k=0,element;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == 2){
                element = entry.getKey();
                result[k++] = element;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int[] res = getSneakyNumbers(arr);
        for (Integer x : res){
            System.out.print(x + " ");
        }
    }
}
