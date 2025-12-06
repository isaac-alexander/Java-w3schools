// FileOutputStream

//The FileOutputStream class works in a similar way, but it writes data as raw bytes. That means you can use it not only for text files, but also for binary files (like images, PDFs, or audio).
//
//Write a Text File (Basic Example)
//This example writes a short text string to a file using FileOutputStream.
//
//Note: If the file already exists, its contents will be replaced (overwritten).
//
//Example


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTut {
    static void main(String[] args) {
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
        // Explanation: This program creates (or overwrites) filename.txt and writes Hello World! into it. If everything works, it prints "Successfully wrote to file." in the console. Otherwise, it shows an error message.


        // Copy a Binary File (Real-World Example)
        //The real strength of FileOutputStream is that it can handle any file type, not just text. Here is an example that copies an image file:
        // Copy image.jpg into copy.jpg
        try (FileInputStream input = new FileInputStream("image.jpg");
             FileOutputStream output = new FileOutputStream("copy.jpg")) {

            int b;
            while ((b = input.read()) != -1) {
                output.write(b);  // write each raw byte to the new file
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error handling file.");
        }
        // Explanation: This program reads image.jpg and writes it into copy.jpg. Since it works with raw bytes, it can copy any kind of file - text, images, audio, or PDFs.


        // Append to a File
        //By default, FileOutputStream overwrites the file if it already exists. To add (append) new content instead, pass true as the second argument:
        String texts = "\nAppended text!";

        // true = append mode (keeps existing content)
        try (FileOutputStream output = new FileOutputStream("filename.txt", true)) {
            output.write(texts.getBytes());
            System.out.println("Successfully appended to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
        // Explanation: This program adds Appended text! to the end of filename.txt, keeping the existing content.
    }
}

//Choosing the Right Class
//Java gives you several ways to write to files. Here's when to pick each one:
//
//FileWriter - best for basic text files. Simple and easy to use.
//BufferedWriter - best for large text files, because it is faster and lets you add new lines easily.
//FileOutputStream - best for binary data (images, PDFs, audio) or when you need full control of raw bytes.
