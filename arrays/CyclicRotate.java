package arrays;
/*
*
*
* 1. Arrayni o‘ngga k marta rotate qilish (Cyclic Rotate)
    Misol:
    arr = [1,2,3,4,5,6,7] va k = 3
    Natija: [5,6,7,1,2,3,4]
    Qiyin joyi: k ni arr.length ga bo‘lib qoldiq olish, joy almashishni optimal qilish kerak.
* */

import java.util.Arrays;
import java.util.Scanner;

public class CyclicRotate {
    public static void rotate(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        if (k==0) return;

        reverse(arr,0,n-1); // arrayni to'liq aylantirish [1,2,3,4,5] ni [5,4,3,2,1] ga
        reverse(arr,0,k-1); // k=3 n=[1 2 3 4 5] bo'lsa natija [3,4,5,2,1] dastlabki k tasi
        reverse(arr,k,n-1); //qolgan qismi
    }
    public static void reverse(int[] ar,int start,int end){
        while (start < end){
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        rotate(arr,k);
        for (Integer integer : arr){
            System.out.print(integer + " ");
        }
    }
}
