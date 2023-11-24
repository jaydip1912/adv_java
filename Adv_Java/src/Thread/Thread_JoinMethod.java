package Thread;

public class Thread_JoinMethod extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
                Thread.sleep(500);
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
        Thread_JoinMethod j1 = new Thread_JoinMethod();
        Thread_JoinMethod j2 = new Thread_JoinMethod();
        Thread_JoinMethod j3 = new Thread_JoinMethod();
        
        j1.start();
        try
        {
            j1.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        j2.start();
        j3.start();
    }
}
