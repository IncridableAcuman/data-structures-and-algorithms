package KEPUZ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctSorted {
    public static int[] distinctSorted(int[] arr){
        if (arr.length == 0) return new int[]{};
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        for (int i=0;i<set.size();i++){
            arr[i] = set.iterator().next();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
       int[] res =  distinctSorted(arr);
        for (Integer i : res){
            System.out.print(i+" ");
        }
    }
}
