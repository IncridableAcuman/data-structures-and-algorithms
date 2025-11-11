package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSortAlgorithm(int[] ar){
        int n=ar.length;
        for (int i=1;i<n;i++){
            int key=ar[i];
            int j=i-1;
            while (j>=0 && ar[j]>key){
                ar[j+1]=ar[j];
                j=j-1;
            }
            ar[j+1]=key;
        }
        for (Integer i : ar){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n= scanner.nextInt();
            int[] ar=new int[n];
            for (int i=0;i<n;i++){
                ar[i]= scanner.nextInt();
            }
            insertionSortAlgorithm(ar);
        }
    }
}
