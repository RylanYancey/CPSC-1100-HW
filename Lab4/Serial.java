import java.util.ArrayList;

public class Serial extends Circuit{

    // All circuits in a series. 
    private ArrayList<Circuit> circuits = new ArrayList<Circuit>();

    // Calculates the resistance of all circuits in the series. 
    public float GetResistance() {
        // the sum of all resistances
        float sum = 0.0f;
        // Iterator that gets all the resistances
        for (Circuit c : circuits) {
            sum += c.GetResistance();
        }
        return sum;
    }

    // add a new circuit to the collection of all circuits. 
    public void Add(Circuit circuit) {
        circuits.add(circuit);
    }
}
