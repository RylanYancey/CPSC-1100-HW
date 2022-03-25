
/**
 * Child of Vehicle. Inherits printMessage and getName, also inherits efficiency.
 */
public class Boat extends Vehicle {

    // class is self-explanatory. See Vehicle for more details.

    public Boat(double efficiency) {
        super(efficiency);
    }

    public void printMessage() {
        System.out.println("I am a Boat. VROOOM!");
    }

    public String getName() { return "Boat"; }

}
