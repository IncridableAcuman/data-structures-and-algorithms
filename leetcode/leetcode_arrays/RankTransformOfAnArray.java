package leetcode.leetcode_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RankTransformOfAnArray {
    public static int[] arrayRankTransform(int[] arr){
        int n = arr.length;
        int[] num = new int[n];
        int[] res = new int[n];
        System.arraycopy(arr, 0, num, 0, n);
        Arrays.sort(num);
        for (int i=0;i<n;i++){
            for (int j=0;j<num.length;j++){
                if (arr[i] == num[j]){
                    res[i] = (j);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        int[] res = arrayRankTransform((a));
        for (Integer integer : res){
            System.out.print(integer+" ");
        }
    }
}
