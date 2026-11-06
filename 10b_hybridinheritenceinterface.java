# Experiment 10(b): Hybrid Inheritance Using Interfaces in Java

## Aim

To develop a Java program to demonstrate hybrid inheritance using interfaces and classes.

## Algorithm

1. Start the program.
2. Create an interface named `Animal` and declare a method `eat()`.
3. Create another interface named `Pet` that extends the `Animal` interface and declares a method `play()`.
4. Create a class named `Dog` that implements the `Pet` interface.
5. Implement the `eat()` and `play()` methods in the `Dog` class.
6. Define a method named `bark()` inside the `Dog` class.
7. Create a class named `HybridInheritance` that extends the `Dog` class.
8. Define a method named `weep()` in the child class.
9. Create an object of the `HybridInheritance` class in the `main()` method.
10. Call all the inherited and implemented methods.
11. Stop the program.

## Program

java

```java
interface Animal
{
    void eat();
}

interface Pet extends Animal
{
    void play();
}

class Dog implements Pet
{
    // Implement the eat() method
    public void eat()
    {
        System.out.println("Dog is eating.");
    }

    // Implement the play() method
    public void play()
    {
        System.out.println("Dog is playing.");
    }

    // Define the bark() method
    void bark()
    {
        System.out.println("Dog is barking.");
    }
}

public class HybridInheritance extends Dog
{
    // Define the weep() method
    void weep()
    {
        System.out.println("Puppy is weeping.");
    }

    public static void main(String[] args)
    {
        // Create an object of the child class
        HybridInheritance puppy = new HybridInheritance();

        // Call all methods
        puppy.eat();
        puppy.play();
        puppy.bark();
        puppy.weep();
    }
}
```



## Result

Thus, the Java program to demonstrate hybrid inheritance using interfaces and classes was successfully written and executed.
