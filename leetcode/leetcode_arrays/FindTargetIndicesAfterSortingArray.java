package leetcode.leetcode_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindTargetIndicesAfterSortingArray {
    public static List<Integer> targetIndices(int[] ar,int target){
        List<Integer> list = new ArrayList<>();
        Arrays.sort(ar);
        for (int i=0;i<ar.length;i++){
            if (ar[i] == target){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        List<Integer> res = targetIndices(a,target);
        for (Integer integer : res){
            System.out.print(integer + " ");
        }
    }
}
