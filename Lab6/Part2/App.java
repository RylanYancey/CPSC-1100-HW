import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        // the number of vehicles we want to create
        final int NUM_VEHICLES = 10;

        // A place to store the vehicles we create
        Vehicle[] vehicles = new Vehicle[NUM_VEHICLES];

        // to generate a random number.
        Random rand = new Random();

        // Create and randomize NUM_VEHICLES amount of vehicles.
        for (int i = 0; i < vehicles.length; i++) {
            // Switch statement. if 0, create Vehicle, if 1, create Car,
            // if 2, create Boat. 
            switch (rand.nextInt(0, 3)) {
                case 0: 
                    vehicles[i] = new Vehicle(rand.nextInt(0, 100));
                    break;
                case 1: 
                    vehicles[i] = new Car(rand.nextInt(0, 100));
                    break;
                case 2:
                    vehicles[i] = new Boat(rand.nextInt(0, 100));
                    break;
                default: System.out.println("your rand statement is wrong.");
                    break;
            }
        }

        // Iterate through all vehicles and print their message.
        for (Vehicle v : vehicles) {
            v.printMessage();
        }

        System.out.println();

        // iterate through all vehicles and print their name and efficiency.
        for (Vehicle v : vehicles) {
            System.out.println(v.getName() + ": " + v.getEfficiency());
        }

        System.out.println();

        // a threshhold variable to control the getFirstBelowT
        int threshhold = 20;
        // get the first efficiency below the threshold.
        // we have to use (Vehicle) because we are casting the Efficiency Object eff to a Vehicle. (the parentheses indicates a cast)
        Vehicle eff = (Vehicle)getFirstBelowT(vehicles, threshhold);

        // if it is noto null, print out the information.
        if (eff == null) 
            System.out.println("There were no efficiencies smaller than " + threshhold); 
        else    
            System.out.println("The first object with efficiency less than " + threshhold + " was " + eff.getName() + " with efficiency of " + eff.getEfficiency() + ".");

    }

    /**
     * Gets the first Efficiency object with an efficiency below a threshold.
     * @param efficiency an array of Efficiency objects we want to check against.
     * @param threshhold the threshhold we are sheckingn against.
     * @return the first efficiency below the threshold.
     * if there is no efficiency below the threshold, will return null.
     */
    public static Efficiency getFirstBelowT(Efficiency[] efficiency, double threshhold) {
        // iterate through all objects.
        for (Efficiency e : efficiency) 
            // check if the efficiency is below the threshhold.
            if (e.getEfficiency() < threshhold) return e;
        // if no efficiency below the threshold is found, return null.
        return null;
    }
}
