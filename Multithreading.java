# Experiment 7: Multithreading in Java

## Aim

To develop a Java program to demonstrate multithreading by creating and executing two or more threads simultaneously.

## Algorithm

1. Start the program.
2. Create a class named `MyThread` that extends the `Thread` class.
3. Override the `run()` method to define the task performed by each thread.
4. Create a class named `Multithreading` with the `main()` method.
5. Create two objects of the `MyThread` class.
6. Assign names to both threads using the `setName()` method.
7. Start both threads using the `start()` method.
8. Execute both threads concurrently.
9. Stop the program.

## Program

java

```java
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
```


Note: The output order may vary each time the program is executed because both threads run concurrently.

## Result

Thus, the Java program to demonstrate multithreading by creating and executing multiple threads using the `Thread` class was successfully written and executed.
