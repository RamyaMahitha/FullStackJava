import java.util.concurrent.*;
public class latchdown {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(3);
        Runnable worker=()->{
            System.out.println(Thread.currentThread().getName()+" worker started");
            try{
                Thread.sleep(2000);
                latch.countDown(); ///decreases the count
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        };
        for(int i=0;i<3;i++){
            new Thread(worker).start();
        }
        latch.wait();// count becomes zero
        System.out.println("All Threads completed");
        
    }
    
}
