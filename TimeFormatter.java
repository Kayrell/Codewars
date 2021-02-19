package kataExercises;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class TimeFormatter {
    public static void main(String[] args) {
        System.out.println(TimeFormatter.formatDuration(50000));
    }

    public static String formatDuration(int seconds) {

        Calendar c = Calendar.getInstance();
//Set time in milliseconds
        c.setTimeInMillis(1000 * seconds);
        int years = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int days = c.get(Calendar.DAY_OF_MONTH);
        int hours = c.get(Calendar.HOUR);
        int minutes = c.get(Calendar.MINUTE);
        int secs = c.get(Calendar.SECOND);



//        long uptime = System.currentTimeMillis();
//
//        long allDays = TimeUnit.MILLISECONDS.toDays(uptime);
//        long years = 0;
//        long days = 0;
//        if(allDays >= 365){
//            years = allDays / 365;
//            days = allDays % 365;
//        }
//        uptime -= TimeUnit.DAYS.toMillis(years);
//
////        long days = TimeUnit.MILLISECONDS
////                .toHours(uptime);
//        uptime -= TimeUnit.DAYS.toMillis(days);
//
//
//
//        long hours = TimeUnit.MILLISECONDS
//                .toHours(uptime);
//        uptime -= TimeUnit.HOURS.toMillis(hours);
//
//        long minutes = TimeUnit.MILLISECONDS
//                .toMinutes(uptime);
//        uptime -= TimeUnit.MINUTES.toMillis(minutes);
//
//        seconds = (int) TimeUnit.MILLISECONDS
//                .toSeconds(uptime);

            return years + " years " + month + "months " + days + "days " + hours + " hours " + minutes + " minutes and " + secs + " seconds.";

    }
}
