package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {

    public static void countingSortAlgorithm(int[] a){
        if (a.length == 0){
            return;
        }
        int n=a.length;
        int max= Arrays.stream(a).max().getAsInt();
        int[] count =new int[max+1];
        for (Integer i : a){
            count[i]++;
        }
        for (int i=1;i<=max;i++){
            count[i]+=count[i-1];
        }
        int[] result=new int[n];
        for (int  i=n-1;i>=0;i--){
            result[count[a[i]]-1]=a[i];
            count[a[i]]--;
        }
        System.arraycopy(result,0,a,0,n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        countingSortAlgorithm(a);

        for (Integer i : a){
            System.out.print(i+" ");
        }
    }
}
