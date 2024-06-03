//  program to convert 24 hour 
import java.util.Date;     // Importing specific date class libraries
import java.text.SimpleDateFormat;
 
public class time {
    public static void main(String[] args)
    {
        // Getting the current  time
        Date date = new Date();
 
       
        System.out.println("Current Time is : " + date);
 
        // set format in 12 hours
        SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
        // hh = hours in 12hr format
        // mm = minutes
        // aa = am/pm
 
        String time = formatTime.format(
            date); // changing the format of 'date'
 
        // display time as per format
        System.out.println(
            "Current Time in AM/PM Format is : " + time);
    }
}
-----------------------------------------------------------------------------------------------------------------
🔸Date Time Class Format is used to display date and time and manipulate date and time
🔸It is also used for formatting date and time class in java across time zone associated data.
🔸‘java.utils’ - one can create an object of the Date class in order to print the current date and time
🔸In order to print the default date and time simply call the print command using toString() 

 ▫️Approaches:

    🔸Using SimpleDateFormat
    🔸Using splitting the string
SimpleDateFormat

SimpleDateFormat class is a class in Java that provides several methods to parse and format the date and time.
This class inherits java.text.DateFormat class.
 The format() method -->format i.e., “mm/dd/yyyy”

Syntax:
[public final String format(Date date)]
-----------------------------------------------------------------------------------------------------------------
 Approach 2: Without using any Special class of java
 import java.util.*;
 
class GFG {
     static void convertTime(String time)
    {
        String format;
 
        // Parsing hours, minutes and seconds in array
        String[] arr = time.split(":");
 
        // Converting hours into integer
        int hh = Integer.parseInt(arr[0]);
 
        if (hh > 12) {
            hh = hh - 12;
            format = "PM";
        }
        else if (hh == 00) {
            hh = 12;
            format = "AM";
        }
        else if (hh == 12) {
            hh = 12;
            format = "PM";
        }
        else {
            format = "AM";
        }
 
        // Converting hh to String and
        // padding it with 0 on left side
        String hour = String.format("%02d", hh);
        String minute = arr[1];
        String second = arr[2];
 
        // Printing formatted time
        System.out.print("Time in 12-hour format is : ");
        System.out.print(hour + ":" + minute + ":" + second
                         + " " + format);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(
            "Enter the time in 24-hour format : ");
        String time = sc.nextLine();
        convertTime(time);
    }
}

