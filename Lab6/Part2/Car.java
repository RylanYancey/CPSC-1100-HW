
/**
 * Child of Vehicle. Inherits printMessage and getName, also inherits efficiency.
 */
public class Car extends Vehicle{
    
    // class is self-explanatory. See Vehicle for more details.

    public Car(double efficiency) {
        super(efficiency);
    }

    public void printMessage() {
        System.out.println("I am a Car. VROOOM!");
    }

    public String getName() { return "Car"; }

}
