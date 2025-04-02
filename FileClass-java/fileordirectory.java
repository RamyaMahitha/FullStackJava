import java.io.File;
import java.io.IOException;
public class fileordirectory {
    public static void main(String[] args) {
    
       // File f=new File("New-Directory1");
       
       // File f=new File("New-Directory1\\file1.java");
        
        File f=new File("listfiles.java");
        System.out.println("is Directory"+ f.isDirectory());
        System.out.println("is file"+ f.isFile());
      
    }

}
