package leetcode.leetcode_arrays;

import java.util.*;

public class PartitionArrayAccordingToGivenPivot {
    public static int[] pivotArray(int[] arr,int pivot){
        int n = arr.length;
        int[] result = new int[n];
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Arrays.sort(arr);
        for (int i=0;i<n/2;i++){
            list.add(arr[i]);
        }
        for (int i=n/2;i<n;i++){
            list1.add(arr[i]);
        }
        Collections.reverse(list);
        list2.addAll(list);
        list2.addAll(list1);
        for (int i=0;i<list2.size();i++){
            result[i] = list2.get(i);
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
        int pivot = scanner.nextInt();
        int[] result = pivotArray(arr,pivot);
        for (Integer res : result){
            System.out.print(res+" ");
        }
    }
}
