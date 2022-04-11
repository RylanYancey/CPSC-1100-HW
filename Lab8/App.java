
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Creating a scanner object to read terminal input to test SquareRootGuess.
        Scanner scan = new Scanner(System.in);

        // Get the user input and launch squareRootGuess. Output to console.
        System.out.println("Input your guess");
        double input = scan.nextDouble();
        System.out.println(Labp1.squareRootGuess(input));

        scan.close();

        // The numbers we want to add.
        int[] numbers = new int[] { 5, 5, 5, 5, 5, 5, 5 };
        // launch the recursive method.
        int result = Labp2.computeAllValuesInArray(numbers);
        // output the result
        System.out.println(result);

    }

    // lab part 1
    public class Labp1 {

        // Helper method for recursive function squareRootGuessRec.
        // Finds the square root of a number.
        public static double squareRootGuess (double x) {
            if (x < 1) return 0.0;
            return squareRootGuessRec(x, x);
        }

        // recursive function for finding the square root of a number.
        private static double squareRootGuessRec (double x, double g) {
            if (Math.abs(x - (g * g)) < 0.001) return g;
            return squareRootGuessRec(x, (g + (x / g)) / 2);
        }

    }

    // lab part 2
    public class Labp2 {

        // Helper method for finding the sum of all values in an array.
        public static int computeAllValuesInArray (int[] input) {
            return computeAllValuesInArrayRec(input, 0, 0);
        }

        // Recursive method for finding sum of all values in an array.
        public static int computeAllValuesInArrayRec (int[] input, int step , int total) {
            if (step == input.length) return total;
            return computeAllValuesInArrayRec(input, step + 1, total + input[step]);
        }

    }
}

