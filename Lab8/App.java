
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.Math.exp;

public class App {

    public static void main(String[] args) throws Exception {
        CapacitorVoltage.calculate();
    }

    /**
     *  Calculates Capacitor Voltage for a given T range.
     */
    public class CapacitorVoltage {
        
        // Scanners declared as statics to avoid unneccessary memory allocation.
        static Scanner txtFileScan;
        static Scanner terminalScan = new Scanner(System.in);
        static PrintWriter writer;

        /**
         * <p> Calculates the voltage of a capacitor using a formula. <p>
         * Calculate will prompt the user for an input file path and output file path. You will need to provide an input
         * path that looks like the following, without the B: (etc) annotations: 
         *  
         *   <p> B: 12.0, R: 500.0, C: 0.25, t_low: 0.0, t_high: 1000.0 </p>
         * 
         *   <p> The formula: B * (1 - exp(-i / (R * C))) + "\n") </p>
         * 
         * @params B => a double value in the formula.
         * @params R => a double value in the formula.
         * @params C => a double value in the formula
         * @params t_low => the low end of the range you want to calculate for t.
         * @params t_high => the high end of the range you want to calculate for t.
         * 
         * <p>The output file will contain 100 outputs. For example, using the numbers above, the calculation will be
         * from 0 to 1000, in steps of 10.</p>
         * 
         * <p> Example of one line in the output file: T: 10 Result: 0.9226038433603709 </p> 
         */
        public static void calculate() throws FileNotFoundException {
            // While loop to get input and output read/writers.
            // we use while(true) to save having to make a boolean. we use `continue` and `break` instead.
            while (true) {
                // Use the terminalScan to get the input path.
                System.out.println("Please enter your input file path");
                String inputPath = terminalScan.nextLine();

                // Use the terminalScan to get the output path
                System.out.println("Please enter your output file path");
                String outputPath = terminalScan.nextLine();

                try { 
                    // Create a new Scanner object with out input_path
                    // also create a new PrintWriter
                    txtFileScan = new Scanner(new File(inputPath)); 
                    writer = new PrintWriter(new File(outputPath));
                } catch (FileNotFoundException e) { 
                    // If the path is invalid, let the user know and have them input a valid path.
                    System.out.println("Invalid path entered. Please enter a valid path.\n");
                    continue;
                }
                // break out of the loop when the input Scanner has a valid path.
                break;
            }

            // this is the array we will write to when we pull the values from the input_path 
            // contains input values
            double[] in = new double[5];

            // use the scanner to get everything
            for (int i = 0; txtFileScan.hasNext(); i++) 
                in[i] = txtFileScan.nextDouble();

            // Make the things more reasonable.
            double B = in[0], R = in[1], C = in[2], t_low = in[3], t_high = in[4];

            // Finds all the values in the specified T range, and writes them to the output_path.
            // int i = (int) t_low because t_low is the low end of the range. We cast because you can't iterate doubles. (or shouldnt)
            // i += t_high / 100 because we need it to iterate 100 times between t_low and t_high
            for (int i = (int)t_low; i < t_high; i += t_high / 100)
                writer.write("T: " + i + " Result: " + (B * (1 - exp(-i / (R * C))) + "\n"));

            // close the writer to avoid an unexpected memory leak.
            txtFileScan.close();
            terminalScan.close();
            writer.close();
        }
    }
}
