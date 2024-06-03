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

