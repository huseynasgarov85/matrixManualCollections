package mentorThread;

public class Threads extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Threads.currentThread().getName()+"->"+MyThread.counter);
            MyThread.counter++;
        }
    }
}
