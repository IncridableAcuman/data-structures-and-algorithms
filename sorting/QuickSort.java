package sorting;

import java.util.Scanner;

public class QuickSort {

    public static void quickSortAlgorithm(int[] ar,int left,int right){
        if (left>=right) return;
        int middle = (left+right)/2;
        int x=ar[middle];
        int i=left;
        int j=right;
        while (i<=j){
            while (ar[i]<x) i++;
            while (ar[j]>x) j--;

            if (i<=j){
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                i++;
                j--;
            }
        }
        if(left<j) quickSortAlgorithm(ar,left,j);
        if (i<right) quickSortAlgorithm(ar,i,right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]= scanner.nextInt();
        }
        quickSortAlgorithm(ar,0,ar.length-1);

        for (Integer i : ar){
            System.out.print(i+" ");
        }
    }
}
