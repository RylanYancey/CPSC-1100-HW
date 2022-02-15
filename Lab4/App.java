public class App {
    public static void main(String[] args) throws Exception {
        Parallel circuit1 = new Parallel();
        circuit1.Add(new Resistor(100.0f));
        Serial circuit2 = new Serial();
        circuit2.Add(new Resistor(100.0f));
        circuit2.Add(new Resistor(200.0f));
        circuit1.Add(circuit2);
        System.out.println("Combined resistance: " + circuit1.GetResistance());
        System.out.println("Expected: 75.0");
    }
}
