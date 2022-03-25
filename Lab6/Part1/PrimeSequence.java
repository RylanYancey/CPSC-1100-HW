public class PrimeSequence implements Sequence {

    // The number we want to retrieve.
    int n = 2;

    /**
     * Implementation of the `Sequence` Interface.
     * @return the next prime number. 
     */
    public int next() {
        // our algorithm wont work if n is 2, so we check the edge
        // case here. If it is, we return 2 and set n to 1.
        // we set n to 1 so that we don't skip 3 in our loop.
        if (n == 2) {
            n = 1;
            return 2;
        }

        // Keeps running until n is prime.
        // we do += 2 becuase no even number (besides 2) is prime
        do { n += 2; } while (!isPrime(n)); 
        return n;
    }

    /**
     * Helper function for finding whether a number is prime.
     * @param n -> the number in question.
     * @return true if and only if the number is prime.
     */
    boolean isPrime(int n) {
        // Checks if the number is divisble by any number smaller than it.
        // we start at 3 because we've already ruled out anything divisible by 2 by doing n += 2. 
        // by iterating
        for (int i = 3; i < n; i++)
            // if it is, its not prime.
            if (n % i == 0) return false;
        // if not, its prime
        return true;
    }
}
