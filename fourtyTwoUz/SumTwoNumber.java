package fourtyTwoUz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumTwoNumber {
    public static int[] twoNumberSum(int[] arr,int targetSum){
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];
        for (Integer num : arr){
            int target = targetSum - num;
            if (set.contains(target)){
                result[0]=target;
                result[1]=num;
            }
            set.add(num);
        }
        Arrays.sort(result);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i=0;i<n;i++){
            ar[i] = scanner.nextInt();
        }
        int targetSum = scanner.nextInt();
        int[] res = twoNumberSum(ar,targetSum);
        for (Integer num : res){
            System.out.print(num+" ");
        }
    }
}
