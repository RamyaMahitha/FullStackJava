import java.util.concurrent.*;
public class callable {
  public static void main(String[] args) throws InterruptedException,ExecutionException{
    ExecutorService exe=Executors.newSingleThreadExecutor();
    Callable<Integer> task=()->{
        Thread.sleep(2000);
        return 10*10;
    };
    Future<Integer> future=exe.submit(task);
    System.out.println("Doing the task");
    Integer res=future.get();
    System.out.println("result"+res);
    System.out.println("task");
    exe.shutdown();

  }    
}
