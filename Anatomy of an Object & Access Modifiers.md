# The Anatomy of an Object

Objects in Java have 3 main parts:

 1. Instance Variables

 2. Constructor

 3. Instance Functions

Lets see an Example:

```java
public class Player {

    public String name;
    public float health;
    public int xp;

    Weapon weapon;

    public Player(String name, float health, int xp, Weapon weapon) {

        this.name = name;
        this.health = health;
        this.xp = xp;

        this.weapon = weapon;

    }

    public void SayName() {
        System.out.println("I am " + name + ". I am here to save you!");
    }

    public int TakeDamage(int damage_amt) {
        health -= damage_amt;
    }
    
    public void Attack() {
    
}
```

