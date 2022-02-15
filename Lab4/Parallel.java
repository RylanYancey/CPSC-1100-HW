import java.util.ArrayList;

public class Parallel extends Circuit {

    // The set of all circuits in this parallel
    private ArrayList<Circuit> circuits = new ArrayList<Circuit>();
    
    // Get the combined resistance of everything in this parallel
    public float GetResistance() {
        // the sum of all resistances
        float sum = 0.0f;
        // Iterator to get all the resistances / 0
        for (Circuit c : circuits) {
            sum += (1.0 / c.GetResistance());
        }
        return 1/sum;
    }

    // Interface with the circuit
    public void Add(Circuit circuit) {
        circuits.add(circuit);
    }
}
