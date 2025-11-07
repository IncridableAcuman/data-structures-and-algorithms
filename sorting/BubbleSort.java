package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSortAlgorithm(int[] ar){
        int n=ar.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;
                }
            }
        }
        for (int j : ar) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ar=new int[n];
        for (int i=0;i<n;i++){
            ar[i] = scanner.nextInt();
        }
        bubbleSortAlgorithm(ar);
    }
}
