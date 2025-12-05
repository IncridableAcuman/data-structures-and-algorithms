package leetcode.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearchAlgorithm(int[] a,int x){
        int left=0;
        int right=a.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (a[mid] == x) return mid;
            if (x<a[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        int x=scanner.nextInt();
        Arrays.sort(a);
        int res=binarySearchAlgorithm(a,x);
        System.out.println(res);
    }
}
