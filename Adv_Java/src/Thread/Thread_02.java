package Thread;

public class Thread_02 implements Runnable
{
    public void run()
    {
        System.out.println("Thread_02 is Running...");
    }
    public static void main(String[] args)
    {
        Thread_02 j1 =new Thread_02();
        Thread t1 =new Thread(j1);
        t1.start();
    }
}
