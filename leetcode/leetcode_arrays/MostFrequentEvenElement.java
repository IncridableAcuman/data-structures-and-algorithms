package leetcode.leetcode_arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentEvenElement {
    public static int mostFrequentEven(int[] arr){
        int n=arr.length;
        int[] targets = new int[n];
        for (int i=0;i<n;i++){
            if (arr[i]%2==0){
                targets[i] = arr[i];
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<targets.length;i++){
            map.put(i,targets[i]);
        }
        int element = targets[0];
        int count = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > count){
                element = entry.getValue();
                count = entry.getKey();
            }
        }
        return element;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        System.out.println(mostFrequentEven(a));
    }
}
