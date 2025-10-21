// Strings - Special Characters

// Because strings must be written within quotes, Java will misunderstand this string, and generate an error:

//String txt = "We are the so-called "Vikings" from the north.";

// The solution to avoid this problem, is to use the backslash escape character.

// The backslash (\) escape character turns special characters into string characters:

// Escape character	    Result  	Description
//  \'	                  '     	Single quote
//  \"	                  "	        Double quote
//  \\	                  \	        Backslash

// Examples

public class SpecialCharacters {
    static void main(String[] args) {
        //  The sequence \"  inserts a double quote in a string:
        String text1 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(text1); // We are the so-called "Vikings" from the north.

        // The sequence \'  inserts a single quote in a string:
        String text2 = "It\'s alright.";
        System.out.println(text2); // It's alright.

        // The sequence \\  inserts a single backslash in a string:
        String text3 = "The character \\ is called backslash.";
        System.out.println(text3); // The character \ is called backslash.
    }
}

// Other common escape sequences that are valid in Java are:
//
//Code	Result
//\n	New Line
//\t	Tab
//\b	Backspace
//\r	Carriage Return
//\f	Form Feed