 # Understanding Java Objects by learning about Memory/RAM
 
Objects in Java allow you to group data together, create your own types, and simplify your code. 
To a beginner, objects are a very difficult topic because their existence is not justified. 
In this article, I will attempt to explain simply how and why we create objects, and how to use them effectively. 

If you find any issues with this article, or do not understand something, do not be afraid to create a new `issue` in the issues tab in your top left 
and I will try and respond. 
 
  ## Understanding Memory. 
 
In your computer you have two primary types of storage; your drive (aka SSD, Hard Drive, Disk, etc) and your Random Access Memory (RAM, also just called Memory).  
 
  - The Drive:  
    
    Long - Term storage, similar to your long term memory. You're not always thinking about what your name is, but you can `recall` it when you need to. 
    Most computers have a Drive capacity of 500GB (Giga Bytes) to 2TB (Tera Bytes, or 2,000 GB)
    
 - The RAM:

    Short - Term storage, similar to your short term memory. Some things you do not need to remember for a very long time, so you remember them temporarily 
    and then discard that data when it is no longer needed. . Most computers have a RAM capacity of 8 GB - 16 GB. 
    
### Why is memory important for programming?

Whenever you create a new variable in Java or any other programming language, you are manipulating your RAM. For example:
```java
int num = 5;
```
To the uninitiated, this line simply creates a new variable which is equal to 5, like an X may be in math class. 
But there is so much more going on here under the surface. This line of code has told your computer to mark off a portion of memory to contain the number 5, the
number associated with our variable `num`. 
 
What is an `int`?
 
 - An `int` is what is called a primitive. If you've taken an introductory computer science course, you know all about primitives. The most notable primatives of Java
   are `int`, `double`, `char`, `byte`, `short`, `long`, `float`, and `boolean`. A `String` is not a primitive since it is actually a List of chars, which are just an 
   unsigned 8-bit integer. (unsigned = non-negative, don't worry about it for now)
    
 - Primitives are most strictly defined as 'A basic interface or segment of code that can be used to build more sophisticated program elements or interfaces.'
   For now, just think of primitives as the basic types supplied to us by Java
   
Why have primitives? 

 - Why so many types? This is a common question for newcomers. The answer to this question is that a `type` correlates with a certain `size` in memory.
   For example, an `int` takes up 4 bytes of memory, while a `double` takes up 8! (bytes refer to how large the data is) 
   This allows you to optomize your code. If you used a `double` for every number, 
   your code would be extremely inefficient. Sometimes a `byte`, which only uses 1 byte, is enough for the job. 
   
### Understanding the Bits and the Bytes
 
Computer memory stores data not in decimal, as full numbers, but in binary, as ones and zeroes. If you're not familiar with the concept of binary, read 
[this article](https://www.mathsisfun.com/binary-number-system.html).  

Understanding Memory in the context of bytes

 - Memory is basically a sequence of billions of 1s' and zeros' in a straight line. 

Bits

 - A bit is a way of storing binary data in `cells`. One cell can be either `0` or `1`. The way the computer stores this data by moving an electron across a field, 
   which looks something like this: `[ x |  ]`. Pretend this `[]` is our bit, and the `x` is an electron. When the electron is on the right, the bit is `0`, and when it
   is on the left, the bit is `1`.  For example, `[   | x ]` would be 0, and `[ x |   ]` is 1. 
   
Bytes

 - A byte is a collection of 8 bits. Bits are grouped together like this since a single bit is not `referencable`, that is an `address` cannot be assigned to it. 
   You'll learn about addresses and references in the next section. When bytes are grouped like this, it makes it easier to work with them. 
 
 

### Memory Addresses

 - Note: `addresses` are also called `references`. 

 - The name that we gave our number, `num`, does not matter. Names are only a way for us and the compiler 
   (The program that converts your human code into instructions the machine can understand) to differentiate between variables. When the code compiles, 
   the variable names are discarded and replaced with their `memory address`. 
   
 - What are references / addresses?  An `address` is nothing more than an a location in memory. If you know a variables' `address`, you can find where the variable is stored and 
   get its value. Other languages have support for something called `pointers`, which are variables which only contain an `address` of another variable. 
   Pointers do not exist in Java, but we can generate a reference with the following code. 

```java
public class Banana {
    public static void main(String[] args) {
        
        int[] old_array = new int[] {1, 2, 3, 4, 5};

        int[] new_array = old_array;

        System.out.println(new_array);
    }
}
```

   For some reason, when you directly assign a java array to another, the array ( `new_array` in this example) becomes a pointer to the old one. 
   ( don't ask me why, I dont know, you're supposed to use old_array.clone ). When you print this new pointer, you get something that looks like this: `[I@5acf9800]` 
   Like we've said before, this is a `memory address`, it is a reference to a location in memory. In th is case, the reference is to the location of `old_array`, and
   is stored in `new_array`. 

   If this is immensely confusing to you, do not worry. It is for most people the first time they see it. You'll get the hang of it. I believe in you. 
   
## What does any of this have to do with Objects? 

Before we discuss this topic, we need to define some terms. 

 - `Class` => A Template for creating objects. 

 - `Object` => An instance of a class. 

There are two exceptions to these definitions. 

 1. The Main Class. 

 2. Static Classes. 

Don't worry too much about these. Just know that there is only ever ONE instance of a main class or static class in a program. 

## Grouping Data

  Another way to define `Objects` is to think of them like grouping data. In many cases, `Objects` hold primitives, but can also contain other objects. 
  Professor Mohammed likes to draw diagrams which look something like this: 
  
  ![image](https://user-images.githubusercontent.com/76256852/151720637-f396047c-d9ad-40e6-a85a-68ac089ee640.png)

  This diagram is of a `Class`. It is a template for us to use. It has some primitives, such as LoginName or Password. Programmatically, this diagram looks like this:
  
  ```java
  public class User {

    // Instance Variables
    String loginName;
    String role;
    boolean item;
    String Password;

    // Constructor
    public User(String loginName, String role, boolean item, String Password) {

        // assign the data according to incoming data
        this.loginName = loginName;
        this.role = role;
        this.item = item;
        this.Password = Password;

    }

    // added for explanation purposes, not a part of diagram above. 
    public void IntroduceYourself() {

        System.out.println("Hello, my name is " + loginName + ".");

    }
}
```
  
Now, say I get a new student at my school named Joe. I may want to create a new `instance` of a user for him. 

![image](https://user-images.githubusercontent.com/76256852/151720933-e2bc5ab1-2472-4cef-8841-af7912134cd7.png)

This is an example of an `Instance` of class User, which as we recall, is a template for us to use. Programmatically, we may create Joe a User object by doing this:

```java
public class MainClass {
    public static void main(String[] args) {
        
        User joe = new User("Joe McSlow", "Freshman", true, "JoeMcSlow12345");

        joe.IntroduceYourself();
        
    }
}
```

### The New Keyword

  The `New` Keyword indicates you are creating a new instance of a class. In the line `User Joe = new User(...);`, You first tell the compiler what type you are creating
  with `User` and give this instance a name with `Joe`. `New User` is indicates you are not *assigning* Joe to an existing instance of User, but creating a new one. Do
  not get wrapped up in the fact that you say `User` twice, the second User just acts as a place to put your Instance Variables, 
  or like `int` he diagram above, "Joe McSlow", "Freshman", etc. ( <= these are Instance Variables, or variables belonging to an instance of a class)
  
### What about memory?
  
  When Objects are created this way, think of it as creating a chunk of memory that is equal to all the primitives inside of it. If a class has three `ints`,
  one `boolean`, and 1 `double`, The total number of bytes that instance will take up is 21. 4 from each `int`, 1 from the `boolean`, and 8 from the `double`. 
  
### The this Keyword

  In the example above, you may have been confused by the `this` Keyword. Definitionally, `this` is an objects' address. The reason we have to use `this` inside 
  the constructor of an object is because we need to tell the program how to assign values coming in through the constructor. Since we used the same variable names   
  for incoming values and our Instance Variables, we have to use `this` to differentiate between them. 

  





















    
    
 
