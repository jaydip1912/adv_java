package Thread;

public class Thread_Priorities extends Thread
{
    public void run()
    {
        System.out.println("Current thread name is"+Thread.currentThread().getName());
        System.out.println("Running Thread is "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args)
    {
        Thread_Priorities t1= new Thread_Priorities();
        Thread_Priorities t2= new Thread_Priorities();
        
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        
        t1.start();
        t2.start();
    }
}
