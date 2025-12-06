// FileOutputStream

//The FileOutputStream class works in a similar way, but it writes data as raw bytes. That means you can use it not only for text files, but also for binary files (like images, PDFs, or audio).
//
//Write a Text File (Basic Example)
//This example writes a short text string to a file using FileOutputStream.
//
//Note: If the file already exists, its contents will be replaced (overwritten).
//
//Example


import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTut {
    public static void main(String[] args) {
            // The text we want to write to the file
            String text = "Hello World!";

            // "try-with-resources": the stream will be closed automatically
            try (FileOutputStream output = new FileOutputStream("filename.txt")) {

                // Write the string as a sequence of bytes to the file
                output.write(text.getBytes());

                // Confirm that the write operation succeeded
                System.out.println("Successfully wrote to file.");

            } catch (IOException e) {
                // If something goes wrong (e.g. file not accessible), show an error message
                System.out.println("Error writing file.");
                e.printStackTrace();  // Print details for debugging
            }
    }
}

