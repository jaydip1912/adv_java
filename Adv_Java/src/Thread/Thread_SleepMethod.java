package Thread;

public class Thread_SleepMethod extends Thread 
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        Thread_SleepMethod j1= new Thread_SleepMethod();
        Thread_SleepMethod j2= new Thread_SleepMethod();
        j1.start();
        j2.start();
    }
}
