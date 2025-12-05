package KEPUZ;

import java.util.Scanner;

public class CompetitionStartTimeSecondary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        String[] currentDate = date.split(":");
        int hour = Integer.parseInt(currentDate[0]);
        int minute = Integer.parseInt(currentDate[1]) + 30;
        StringBuilder sb = new StringBuilder();
       if (minute==60){
         sb.append(hour+1).append(":").append("00");
       } else if (minute>60){
           int tr = minute - 60;
           if (tr>10){
               sb.append(hour+1).append(":").append(tr);
           } else {
               sb.append(hour + 1).append(":").append("0").append(tr);
           }
       }
    }
}
