package leetcode.strings;


// https://leetcode.com/problems/string-compression/description/
public class StringCompressionPrimary {
    public static int compressionString(char[] chars){
        int i=0,j=1;
        StringBuilder sb = new StringBuilder();
        if (chars.length<2) return chars.length;
        while (i<chars.length){
            int count = 1;
            char currentChar = chars[i];
            while (j<chars.length && chars[i] ==chars[j]){
                j++;
                count++;
            }

            if (count==1) {
                sb.append(currentChar);
            }
            else {
                sb.append(count);
            }
            i=j;
            j++;
        }
        for (int x=0;x<sb.length();x++){
            chars[x]=sb.charAt(x);
        }
        return sb.length();
    }
    public static void main(String[] args) {
        char[] characters = new char[]{'a','b','a','b','b','a','a','a'};
        System.out.println(compressionString(characters));
    }
}
