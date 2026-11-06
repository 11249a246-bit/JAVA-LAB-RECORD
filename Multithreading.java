class MyThread extends Thread
{
    // Override the run() method
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName()
                    + " - Count: " + i);
        }
    }
}

public class Multithreading
{
    public static void main(String[] args)
    {
        // Create two thread objects
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Set thread names
        t1.setName("Thread 1");
        t2.setName("Thread 2");

        // Start both threads
        t1.start();
        t2.start();
    }
}
