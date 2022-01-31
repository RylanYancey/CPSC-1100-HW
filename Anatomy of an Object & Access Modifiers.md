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

aight I'll finish this later













