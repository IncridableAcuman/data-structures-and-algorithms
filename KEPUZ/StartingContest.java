package KEPUZ;

import java.time.LocalTime;

public class StartingContest {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(20,0);
        int s = time.toSecondOfDay();
        System.out.println(s);
    }
}
