
/**
 * The Superclass that dictates how Vehicles behave. 
 * 
 */
public class Vehicle implements Efficiency {
    
    // The fuel efficiency of the vehicle
    protected double efficiency;

    // Superclass Constructor
    public Vehicle(double efficiency) {
        this.efficiency = efficiency;
    }

    // all subclasses inherit this from Vehicle
    // prints the message
    public void printMessage() {
        System.out.println("I am a Vehicle. VROOOM!");
    }

    // All subclasses inherit this from Vehicle
    // returns the name
    public String getName() { return "Vehicle"; } 

    // Inherited from Efficiency
    // gets the efficiency, very exciting.
    public double getEfficiency() { return efficiency; }

}
