public class NThread2 implements Runnable{
    @Override
    public void run(){
        System.out.printf("%s started...", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getPriority());
        }catch (InterruptedException e){
            System.out.printf("Thread %s is Interrupted\n", Thread.currentThread().getName());
        }
        System.out.printf("Finished\n", Thread.currentThread().getName());
    }
}
