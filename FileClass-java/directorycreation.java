import java.io.File;
import java.io.IOException;
public class directorycreation {
    public static void main(String[] args) {
        File dir=new File("New-Directory3");
        if(dir.mkdir()){
        System.out.println("Directory created successfully");
    }
    else{
        System.out.println("Directory not created");
    }

    }
    
}
