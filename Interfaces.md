# Interfaces in Java

Interfaces allow you to make a `promise` that an `object` will have certain methods.  This way, they are interchangable. 

This is what an interface looks like: 

```java
interface Animal {
    void MakeNoise();
    void Sleep();
    void Eat();
    
    String GetName();
    int GetAge();
}
```

Methods in an interface do not have implementations. These methods will be implemented by a class which inherits Animal. 

In the example below, we are implementing Animal in the Pig class. 

```java
public class Pig implements Animal {
    private String name;
    private int age;
    private boolean isAsleep = false;
    
    public Pig (String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void MakeNoise() { System.out.println("Oink"); }
    public void Sleep() { isAsleep = true; }
    public void Eat() { /* consume food */ }
    
    public String Getname() { return name; }
    public string GetAge() { return age; }
}
```

When you impement an interface like this, you can be certain that Pig will have all the methods the interface specifies.
In the example below, you can see how you can create a `generic` class. 

 - A `generic` class is:
 
      Generic programming is a style of computer programming in which algorithms are written in terms of types to-be-specified-later that are then instantiated when needed for specific types provided as parameters.
      
Essentially what this means is that the type of a generic class is only known at runtime (while the program is running) rather than compile time (while the program is compiling, or 'building'). The problem that arises when doing this is that it is possible to run into errors. This could be because a class the generic is accessing does not have a methood it expected, which would result in a runtime error. Because of this, you have to make guarantees about that data, that it will have the methods you are trying to use. 

```java
public class AnimalPen<T> implements Animal {
  
}
```























