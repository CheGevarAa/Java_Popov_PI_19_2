public class TaskThread{
    public static void task(String[] args){
    Thread thread = new Thread(){
        @Override
        public void run() {
            System.out.println(getState());
        }
    };
    System.out.println(thread.getState());
    thread.start();
    try{
        thread.join();
    } catch(InterruptedException e){
        e.printStackTrace();
    }
    System.out.println(thread.getState());
}
}
