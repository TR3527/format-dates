package com.pluralsight;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class FormatDates {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        //System.out.println("Today is: " + today);

        LocalTime currentTime = LocalTime.now();
       // System.out.println("The current time is: " + currentTime);

        LocalDateTime rightNow = LocalDateTime.now();
        //System.out.println("Right now, it is: " + rightNow);


        //4 formats

        DateTimeFormatter formatOne = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println(rightNow.format(formatOne));


        DateTimeFormatter formatTwo = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println(rightNow.format(formatTwo));


        DateTimeFormatter formatThree = DateTimeFormatter.ofPattern("MMMM d, yyyy");

        System.out.println(rightNow.format(formatThree));;


        DateTimeFormatter formatFour = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");

        System.out.println(rightNow.format(formatFour));




        DateTimeFormatter formatBonus = DateTimeFormatter.ofPattern("hh:mm  ' on ' dd-MMM-yyyy");

        System.out.println(rightNow.format(formatBonus));

//
    }
}
