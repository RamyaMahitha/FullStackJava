import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Execeutorservice {
    public static void main(String[] args) {
        ExecutorService  executor=Executors.newFixedThreadPool(3);
        Runnable task=()->{
            System.out.println(Thread.currentThread().getName()+" is executing");
            try{
            Thread.sleep(2000);
            }
            catch(InterruptedException e){}
        };
        for(int i=0;i<5;i++){
            executor.submit(task);
        }
        executor.shutdown();
    }
    
}
