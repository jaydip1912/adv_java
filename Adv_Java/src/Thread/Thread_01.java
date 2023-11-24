package Thread;

public class Thread_01 extends Thread
{
    public void run()
    {
        System.out.println("Thread is Running.....");
    }    
    public static void main(String[] args)
    {
        Thread_01 t1 =new Thread_01();
        t1.start();
    }
}
