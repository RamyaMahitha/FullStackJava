import java.io.File;
import java.io.IOException;
public class Createfile {
    public static void main(String[] args) {
       //File f=new File("NewFile1");
       // System.out.println("Exists/ Not: "+f.exists()); // false
   // File f=new File("file1.java");
     //   System.out.println("Exists/ Not: "+f.exists()); // false ,because not in same directory
      //  File f=new File("New-Directory1\\file1.java");
       // System.out.println("Exists/ Not: "+f.exists()); // true because mentioned the directory
       // File f=new File("listfiles.java");
    //System.out.println("Exists/ Not: "+f.exists()); // true

    File f=new File("NewFile1");
    try {
        if (f.createNewFile()) {
            System.out.println("File created: " + f.getName());
        } else {
            System.out.println("File already exists.");
        }
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    File f1=new File("listfiles");
if (f1.delete()) {
    System.out.println("File deleted: " + f1.getName());
} else {
    System.out.println("Failed to delete the file.");
}

    }
    
}
