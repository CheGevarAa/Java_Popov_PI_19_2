public class NThread extends Thread{
    NThread(String name){
        super(name);
    }

    public void run(){
        System.out.printf("%s started...", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getPriority());
        }catch (InterruptedException e){
            System.out.printf("Thread %s is Interrapted\n", Thread.currentThread().getName());
        }
        System.out.printf("Finished\n", Thread.currentThread().getName());
    }
}
