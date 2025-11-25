// Java Dates
//Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. The package includes many date and time classes. For example:
// Class	    Description
//LocalDate	    Represents a date (year, month, day (yyyy-MM-dd))
//LocalTime	    Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
//LocalDateTime	    Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
//DateTimeFormatter 	Formatter for displaying and parsing date-time objects


// Display Current Date
//To display the current date, import the java.time.LocalDate class, and use its now() method:

// Display Current Time
//To display the current time (hour, minute, second, and nanoseconds), import the java.time.LocalTime class, and use its now() method:

// Display Current Date and Time
//To display the current date and time, import the java.time.LocalDateTime class, and use its now() method:

// Formatting Date and Time
//The "T" in the example above is used to separate the date from the time. You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects. The following example will remove both the "T" and nanoseconds from the date-time:

// The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format.
//Example

// import the LocalDate class
import java.time.LocalDate;

import java.time.LocalTime;  // import the LocalTime class

import java.time.LocalDateTime;  // import the LocalDateTime class

import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();  // Create a date object
        System.out.println(myObj);  // Display the current date

        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2);

        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println(myObj3);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
