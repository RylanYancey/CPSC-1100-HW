# The Anatomy of an Object

If you havent read Memory & Objects.md, I recommend you do so before reading this. 

Objects in Java have 3 main parts:

 1. Instance Variables

 2. Constructor

 3. Instance Functions

Lets see an Example:

```java
public class Player {

    // -- Instance Variables -- // -------------
    public String name;
    protected float health;
    int xp;

    Weapon weapon;

    // -- Constructor -- // --------------------
    public Player(String name, float health, int xp, int sharpness, int length) {

        this.name = name;
        this.health = health;
        this.xp = xp;

        this.weapon = new Weapon(sharpness, length);

    }

    // -- Instance Functions -- // ------------

    public void SayName() {
        System.out.println("I am " + name + ". I am here to save you!");
    }

    public int TakeDamage(int damage_amt) {
        health -= damage_amt;
    }
    
    public void Attack() {
        System.out.println("You dealt " + weapon.damage + " damage");
    }
}
```

## Instance Variables

The first section of the above code is Instance Variables. These are variables which `Belong` to their parent class. In this case, the instance variables for `Player` are the primitives name, health, and xp, and the custom type weapon. 

Custom Types:
 - You can think of classes as custom types.  Objects can belong to other objects. `Weapon` in `Player` is another class. It may look like this. 

```java
public class Weapon {

    int sharpness;
    int length;
    
    public Weapon(int sharpness, int length) {
        this.sharpness = sharpness;
        this.length = length;
    }

}
```

In the `Player` class, we've created an instance of the `Weapon` class as an instance variable. This instance of `Weapon` `belongs` to the `Player` class. 
 
## The Constructor

Constructors allow you to initialize an instance of a class and customize its values. In the `Player` class, you would call it like this:

```java
Player hero = new Player("Hero", 1000.0, 0, 20, 5);
```

Now you have an instance of `Player` called `Hero`!

Note: A constructor NEVER has a return type. That is what defines it as a constructor. It MUST be public. 

## Instance Functions

Instance Functions are similar to the instance variables in that they *belong* to the class instance. For example, in order to call the method `Attack`, you would need a `reference` to the instance. For example, if you declared `Player` as `hero` like we did above, we would do `hero.Attack()`. 

# Access Modifiers

Access Modifiers tell program how instance variables and functions should be accessed. 

## Public vs Private

The public access modifiers indicates instances members can be accessed directly. Look at the following code. 

```java
public class Example {
   public void DoAThing() {
     System.out.println("I did a thing!");
   }
}

public class Main {
  public static void main(String[] args) {
     Example example = new Example();
     example.DoAThing();
  }
}
```
This code will output `I did a thing!` to the terminal. 
Now if we changed the `Example` class' DoAThing method to be private:
``` java
public class Example {
   private void DoAThing() {
     System.out.println("I did a thing!");
   }
}
```
Now if we run the code, it will return a compilation error because we cannot access the method outside the class because it is private. 

## Static Modifier

`Static` is not an access modifier. Static is an indicator of how the method behaves in memory. 
Whenever a new object is created, a copy of the class created in memory. This means there is a new location created for each instance variable and instance method. 
However, if a member is named `static`, only one copy of it exists. For example:
```java
public class Example {
   private static void DoAThing() {
     System.out.println("I did a thing!");
   }
}
```
Now, when a new instance of `Example` is created, there will only be one `DoAThing` method in memory, no matter how many copies of `Example` you create. 
```java
public class Example {
  static int number = 5;
}
public class Main {
  public static void main(String[] args) {
     Example example1 = new Example();
     Example example2 = new Example();
     example1.number = 20000;
     System.out.println(example1.number + " " + example2.number);
  }
}
```
In the above example, we created a `static int` named number. Becuase it is static, there will only be one `number` for all classes. If we run the code, the output will be `20000 20000`. It will not be `20000 5` because the `number` in `example1` is the same as the `number` in example2. 














