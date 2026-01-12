/*
ShowCurrentTime.java gives a program that displays the current time in GMP.  
Revise the program so that it prompts the user to enter the Time Zone
in hours away from GMT and display the time in the specified Time Zone.
*/

public class ShowCurrentTime {
    public static void main(String[] args) {
      // Obtain the total milliseconds since midnight, Jan 1, 1970
      long totalMilliseconds = System.currentTimeMillis();
  
      // Obtain the total seconds since midnight, Jan 1, 1970
      long totalSeconds = totalMilliseconds / 1000;
  
      // Compute the current second in the minute in the hour
      long currentSecond = totalSeconds % 60;
  
      // Obtain the total minutes
      long totalMinutes = totalSeconds / 60;
  
      // Compute the current minute in the hour
      long currentMinute = totalMinutes % 60;
  
      // Obtain the total hours
      long totalHours = totalMinutes / 60;
  
      // Compute the current hour
      long currentHour = totalHours % 24;
  
      // Display results
      System.out.println("Current time is " + currentHour + ":"
        + currentMinute + ":" + currentSecond + " GMT");
    }
  }