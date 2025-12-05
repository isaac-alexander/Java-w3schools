// FileInputStream
//So far, you have used the Scanner class to read text files. Scanner is very convenient for text because it can split input into lines, words, or numbers. However, sometimes you need more control. For example, when reading binary data (like images, audio, or PDFs), or when you need full control of raw bytes. In those cases, you use FileInputStream.
//
//Read a Text File (Basic Example)
//This example uses FileInputStream to read a text file, one byte at a time, and print the result as characters:







//Example
import java.io.IOException;

public class FileInputStream {
    public static void main(String[] args) {
        // "try-with-resources": the stream will be closed automatically
        try (java.io.FileInputStream input = new java.io.FileInputStream("filename.txt")) {
            int i;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
