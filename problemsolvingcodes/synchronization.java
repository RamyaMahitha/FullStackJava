import java.lang.Thread;
import java.lang.*;
class Shared{
    //public void run(){
      synchronized  public void print(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+": "+i);
            try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){

        }
    }
    }
}
public class synchronization {
    public static void main(String[] args) {
        Shared obj=new Shared();
        Thread t1=new Thread(()->obj.print(),"Thread1"); //the lambda expression creates an anonymous runnable that calls print , implicitly the lambda expressions provides a runnable implementation
        Thread t2=new Thread(()->obj.print(),"Thread2");
        t1.start();
        t2.start();
        
    }

    
}
