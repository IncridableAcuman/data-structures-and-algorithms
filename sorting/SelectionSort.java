package sorting;

import java.util.Scanner;

public class SelectionSort {
//    O(n^2) sorting
    public static void selectionSortAlgorithm(int[] ar){
        int n=ar.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for (int j=i+1;j<n;j++){
                if (ar[j]<ar[min_index]){
                    min_index=j;
                }
            }
            int temp=ar[min_index];
            ar[min_index]=ar[i];
            ar[i]=temp;
        }
        for (int j : ar) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            int n= scanner.nextInt();
            int[] ar = new int[n];
            for (int i=0;i<n;i++){
                ar[i]= scanner.nextInt();
            }
            selectionSortAlgorithm(ar);
        }
    }
}
