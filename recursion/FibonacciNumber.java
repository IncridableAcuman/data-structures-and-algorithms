package recursion;

import java.util.Scanner;

// 1-METHOD
public class FibonacciNumber {

    public static int fib(int n){
        if(n==0) return 0;
        if(n<=2) return 1;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n=scanner.nextInt();
            System.out.println(fib(n));
        }
    }
}
// 2-METHOD
//public class FibonacciNumber {
//
//    public static int fib(int n){
//        if(n==0) return 0;
//        if(n==1) return 1;
//        int[] db=new int[n+1];
//        db[0]=0;
//        db[1]=1;
//        for (int i=2;i<=n;i++){
//            db[i]=db[i-1]+db[i-2];
//        }
//        return db[n];
//    }
//
//    public static void main(String[] args) {
//        try (Scanner scanner = new Scanner(System.in)) {
//            int n=scanner.nextInt();
//            for (int i=1;i<=n;i++){
//                System.out.print(fib(i)+" ");
//            }
//        }
//    }
//}
//3-METHOD
//public class FibonacciNumber {
//
//    public static int fib(int n){
//        if(n==0) return 0;
//        if(n==1) return 1;
//        int a=0,b=1;
//        for (int i=2;i<=n;i++){
//            int c=a+b;
//            a=b;
//            b=c;
//        }
//        return b;
//    }
//
//    public static void main(String[] args) {
//        try (Scanner scanner = new Scanner(System.in)) {
//            int n=scanner.nextInt();
//            for (int i=1;i<=n;i++){
//                System.out.print(fib(i)+" ");
//            }
//        }
//    }
//}
//public class FibonacciNumber {
//    public static int binetFormulaForFindFibonacciNumber(int n){
//        double sqrt5 = Math.sqrt(5.0);
//        double phi = (1.0+sqrt5)/2.0;
//        return (int) Math.round(Math.pow(phi,n)/sqrt5);
//
//    }
//public static void main(String[] args) {
//    try (Scanner scanner = new Scanner(System.in)) {
//        int n=scanner.nextInt();
//        for (int i=1;i<=n;i++){
//            System.out.print(binetFormulaForFindFibonacciNumber(i)+" ");
//        }
//    }
//    }
//}

//public class FibonacciNumber {
//    public static long findFibonacciNumberWithMatrixMethod(int n){
//        if (n==0) return 0;
//        long[][] F = {{1,1},{1,0}};
//        power(F,n-1);
//        return F[0][0];
//    }
//
//    public static void multiply(long[][] F,long[][] M){
//        long x=F[0][0]*M[0][0]+F[0][1]*M[1][0];
//        long y=F[0][0]*M[0][1]+F[0][1]*F[1][1];
//        long z=F[1][0]*M[0][0]+F[1][1]*M[1][0];
//        long w=F[1][0]*M[0][1]+F[1][1]*M[1][1];
//        F[0][0]=x;F[0][1]=y;F[1][0]=z;F[1][1]=w;
//    }
//
//    public static void power(long[][] F,int n){
//        if(n==0 || n==1) return;
//        long[][] M = {{1,1},{1,0}};
//        power(F,n/2);
//        multiply(F,F);
//        if(n%2!=0){
//            multiply(F,M);
//        }
//    }
//
//    public static void main(String[] args) {
//        try (Scanner scanner = new Scanner(System.in)) {
//            int n=scanner.nextInt();
//            for (int i=1;i<=n;i++){
//                System.out.print(findFibonacciNumberWithMatrixMethod(i)+" ");
//            }
//        }
//    }
//}