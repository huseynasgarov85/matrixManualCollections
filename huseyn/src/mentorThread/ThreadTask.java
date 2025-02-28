package mentorThread;

public class ThreadTask extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >=0 ; i--) {
            System.out.println(Thread.currentThread().getName()+"->"+MyThread.counter);
            MyThread.counter--;
        }
    }
}
