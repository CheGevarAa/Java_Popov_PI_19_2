public class Main {
    public static void main(String[] args){
       // Thread t = Thread.currentThread();
        //System.out.println(t);
        NThread t = new  NThread("NewThread");
        t.start();
        try{
            t.join();
        }catch (InterruptedException e){
            System.out.printf("Interrr", t.currentThread().getName());
        }
        System.out.println("Finished");
    }
}
