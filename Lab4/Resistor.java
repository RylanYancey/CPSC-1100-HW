public class Resistor extends Circuit {
    
    // The resistance of this particular resister
    float resistance;

    // Initializes the resister
    public Resistor(float resistance) {
        this.resistance = resistance;
    }

    // Gets the resistor
    public float GetResistance() {
        return resistance;
    }
}
