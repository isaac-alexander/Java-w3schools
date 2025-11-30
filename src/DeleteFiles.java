// Delete a File
//To delete a file in Java, use the delete() method:

// Delete a Folder
//You can also delete a folder. However, it must be empty:

//Example

import java.io.File;
public class DeleteFiles {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        // Delete a File
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
        // OUTPUT : Deleted the file: filename.txt

        // Delete a Folder
       // File myObj = new File("C:\\Users\\MyName\\Test");
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
        // OUTPUT : Deleted the folder: Test
    }
}
