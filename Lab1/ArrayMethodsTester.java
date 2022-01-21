import java.util.Arrays;
import java.util.Random;

/*
    Author: Rylan Yancey
    Date: 1/ 21/ 2022/

    This class is for testing the ArrayMethods class.
*/

public class ArrayMethodsTester {

    //helper method to print an array
    public static void printArray(int[] values, String message) {
        System.out.println(message + Arrays.toString(values) + "\n");
    }

    public static void main(String[] args) {
        
        Random random = new Random();
        int[] values = new int[10];

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(32);
        }

        printArray(values, "Initial Array: ");

        // -- Swap First and Last -- // 
        int temp[] = values.clone();
        ArrayMethods.swapFirstAndLast(temp);

        printArray(temp, "Swapped the first and last: " );

        // -- Shift Right -- // 
        temp = values.clone();
        ArrayMethods.shiftRight(temp);

        printArray(temp, "Shifted All Elements to the Right: ");

        // -- SetEvensToZero -- // 
        temp = values.clone();
        ArrayMethods.setEvensToZero(temp);

        printArray(temp, "Set all Events to Zero: ");

        // -- LargerOfAdjacents -- // 
        temp = values.clone();
        ArrayMethods.largerOfAdjacents(temp);

        printArray(temp, "Sets all elements to the largest adjacent element: ");

        // -- RemoveMiddle -- // 
        temp = values.clone();

        printArray(ArrayMethods.removeMiddle(temp), "Removed the middle element(s): ");

        // -- MoveEventsToFront -- // 
        temp = values.clone();
        ArrayMethods.moveEvensToFront(temp);

        printArray(temp, "Moved the evens to the front: ");

        // -- Return Second Largest -- //
        System.out.println("The second largest values is " + ArrayMethods.ret2ndLargest(values) + ".\n");
        
        // -- IsSorted -- //
        System.out.println("Is the array sorted? " + ArrayMethods.isSorted(values) + ".\n");

        // -- HasDuplicates -- // 
        System.out.println("The array has adjacent duplicates: " + ArrayMethods.hasAdjDuplicates(values) + ".\n");

        // -- Has Adjacent Duplicates -- // 
        System.out.println("The array has Duplicates: " + ArrayMethods.hasDuplicates(values) + ".\n");

    }
}
