// Read a File
//In the following example, we use the Scanner class to read the contents of the text file we created in the previous chapter:

//Get File Information
//To get more information about a file, use any of the File methods:


//Example

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // OUTPUT: Files in Java might be tricky, but it is fun enough!

        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}

//Explanation Example1: This program opens the file named filename.txt and reads it line by line using a Scanner. Each line is printed to the console. If the file cannot be found, the program will print "An error occurred." instead
//
// Other Ways to Read Files
//There are several classes you can use to read files in Java:
//
//Scanner - best for simple text and when you want to parse numbers or words easily.
//BufferedReader - best for large text files, because it is faster and reads line by line.
//FileInputStream - best for binary data (images, audio, PDFs) or when you need full control of raw bytes..