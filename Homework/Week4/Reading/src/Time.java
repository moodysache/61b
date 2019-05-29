import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public static Time noon() {
        return new Time(12,0,0);
    }

    public static Time midnight() {
        return new Time(0,0,0);
    }

    public static Time ofSeconds(long seconds) {
        int minutes=0;
        int hours=0;
        while(seconds>59){
            seconds-=60;
            minutes++;
            if(minutes>59){
                hours++;
                minutes=0;
                if(hours>23){
                    hours=0;
                }
            }
        }
        return new Time(hours,minutes,(int)seconds);

    }

    public static Time of(int hour, int minute, int second) {
        return new Time(hour,minute,second);
    }


/* Do not change code below */
  static class Main {

    public static void main(String args[]) {
       Time j=Time.ofSeconds(500000);

    }


}
}