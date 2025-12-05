package KEPUZ;


public class General {
    public static String addStringNumber(String num1,String num2){
        int len1 = num1.length(),len2 = num2.length();
        int[] arr = new int[len1+len2];
        for (int i=len1-1;i>=0;i--){
            for (int j=len2-1;j>=0;j--){
                int p1 = i+j,p2 = i+j+1;
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + arr[p2];
                arr[p1] = sum/10;
                arr[p2] = sum%10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p : arr) if (!(sb.isEmpty() && p==0)) sb.append(p);
        return sb.isEmpty() ? "0" : sb.toString();
    }
    public static void main(String[] args) {
        String a = addStringNumber(String.valueOf(1944),String.valueOf(12));
        System.out.println(a);
    }
}
