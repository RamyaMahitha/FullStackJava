import java.io.File;
import java.io.IOException;
    public class listfiles{
        public static void main(String[] args) {
    File dir=new File("New-Directory1");
    String[] files=dir.list();
    for(String i : files){
        System.out.println(i);
        }
    }
        
    }
    

