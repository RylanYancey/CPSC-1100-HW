
/*
    Author: Rylan Yancey // CGW512
    Date: 1/ 21/ 2022/

    ArrayMethods is a class that consists of helpful methods
    for working with arrays. 

    !Warning!: Some methods are not helpful. Not liable for damages related to unhelpfulness. 
*/

import java.util.Arrays;

public class ArrayMethods {

    /**
     * PART A - Swap the First and Last Element
     * <p> Swaps the first element with the last element.
     * @param values
     */
    public static void swapFirstAndLast(int[] values) {

        // save the first element to a temp var
        int temp = values[0];

        //move the last element to the first position
        values[0] = values[values.length-1];

        // now put the saved first element into the last position
        values[values.length-1] = temp;
    }

    /**
     * PART B - Shift All Elements to the RIGHT
     * <p> All elements will be shifted one index to the right. 
     * The last element will be set to the first. 
     * @param values
     */
    public static void shiftRight(int[] values) {

        // The last value of the array, so we can insert it. 
        int last_value = values[values.length - 1];

        // We CLONE the array because otherwise temp_array is just a reference to values, 
        // which would copy our changes of temp_array to values. 
        int[] temp_array = values.clone();

        // For loop that shift everything to the right. 
        for( int i = 0; i < values.length - 1; i++ )
        {
            temp_array[i + 1] = values[i];
            values[i] = temp_array[i];
        }

        // assign the last value to temp_array[0]
        values[0] = last_value;
        values[values.length - 1] = temp_array[temp_array.length - 1];
    }

    /**
     * PART C - Set All Evenss To Zero
     * <p> All Evens In the input array will be set to Zero. 
     * @param values
     */
    public static void setEvensToZero(int[] values) {

        // Loop through the array
        for(int i = 0; i < values.length; i++) {
            // use Modulo operator to find which ones are even, and set them to zero. 
            if (values[i] % 2 == 0) values[i] = 0;
        }
    }

    /**
     * PART D - The Larger Of Adjacents
     * <p> the input array such that every index is equal to the largest of its neighbours. 
     * @param values
     */
    public static void largerOfAdjacents(int[] values) {

        // Create a temporary array
        int[] temp = new int[values.length];

        // Handle the first element
        if (values[0] < values[1])
            temp[0] = values[1];

        // loop through and handle the middle elements
        for(int i = 1; i < values.length - 1; i++) {
            // Compare the values adjacent. the index is now equal to the higher one. 
            if (values[i - 1] > values[i + 1]) 
                temp[i] = values[i - 1];
            else 
                temp[i] = values[i + 1];
        }

        // Handle the last element
        if (values[values.length - 1] < values[values.length - 2]) 
            temp[values.length - 1] = values[values.length - 2];

        // Set temp to values. 
        for (int i = 0; i < values.length; i++) {
            values[i] = temp[i];
        }
    }

    /**
     * PART E - Remove The Middle Index
     * <p> A new array, with either the middle 1 or 2 indexes removed, 
     * depending on whether the length is even or odd. 
     * @param values
     */
    public static int[] removeMiddle(int[] values) {

        // Determine whether or not the array has an even length. 
        boolean is_even = (values.length % 2 == 0);
    
        // initialize new array based on whether or not even is true
        int[] result;
        if(is_even)
            // -2 because we are removing two elements if even
            result = new int [values.length - 2];
        else 
            // -1 because we are removing one element if odd. 
            result = new int [values.length - 1];
    
        // Determine the index of the middle two values. 
        int middle_1 =  values.length / 2;
        int middle_2 = values.length / 2 - 1;
    
        // Index variable to iterate so we can find the index in the result. 
        int index = 0;

        // Loop through and assign values. 
        for(int i = 0; i < values.length; i++)
        {
            // Checking if the index is right to pull from
            if(is_even && (i == middle_1 || i == middle_2))
                continue;

            else if(!is_even && i == middle_1)
                continue;
    
            // assigning the value. 
            result[index] = values[i];
            index++;
        }
    
        // return the value (ofc)
        return result;
    }

    /**
     * PART F - Move Evens To The Front
     * <p> the inputted array to move all even values to the front of the array, and all odd values to the back. 
     * @param values
     */
    public static void moveEvensToFront(int[] values) {

        // Creating a temporary array
        int[] temp = new int[values.length];

        // Counts the even numbers so we can index it. 
        int counter = 0;

        // counts the odd numbers so we can index it. 
        int odd_counter = values.length - 1;

        // Loop through every index
        for (int i = 0; i < values.length; i++)
        {
            // if even, put it on the index of counter, iterate counter
            if (values[i] % 2 == 0) {
                temp[counter] = values[i];
                counter++;
            }
            // If odd, put it on the index of odd_counter, iterate odd_counter
            else {
                temp[odd_counter] = values[i];
                odd_counter--;
            }
        }

        // assign temp to values. 
        for (int i = 0; i < temp.length; i++)
        {
            values[i] = temp[i];
        }
    }

    /**
     * PART G - Return Second Largest
     * @param values
     * @return The second largest value in an integer array. 
     */
    public static int ret2ndLargest(int[] values) {

        // sort array. This means the largest value is the last index. 
        int[] temp = values.clone();
        Arrays.sort(temp);

        // We can't just take values[values.length - 2] as our seconod largest because there might be two largest. 
        // Ex: [...5,20,20] -> We have to check for this in the loop below. 
        // Note: we must iterate from top down, since it sorts in ascending order. 
        for(int i = temp.length - 1; i > 0; i--) {
            // Check if last element (largest) is equal to current. The moment it isnt, we've got our guy. 
            if (temp[temp.length - 1] != temp[i]) {
                // This value will be the second largest. 
                return temp[i];
            }
        }
        return 0;

    }

    /**
     * PART H - Is Sorted
     * @param values
     * @return True if and only if the array is sorted in ascending order. Ex: [0, 1, 2, 3];
     */
    public static boolean isSorted(int[] values) {

        for (int i = 0; i < values.length - 1; i++) {
            // Checks if current value is greater than next value. If it is, its not sorted. 
            if (values[i] > values[i + 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * PART I - Has Adjacent Duplicates
     * @param values
     * @return True is two adjacent indexes are the same. 
     */
    public static boolean hasAdjDuplicates(int[] values) {

        // finds duplicates by checking if each element is the same as the next one. 
        // if it is, return true.

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                return true;
            }
        }

        return false; 
    }

    /**
     * PART J - Has Duplicates 
     * @param values
     * @return True if any two indexes in `values` are the same. 
     */
    public static boolean hasDuplicates(int[] values) {

        // Brute-force checks every element against every other element. 
        // If any two elements are the same, return true. Otherwise the loop runs out and its false. 
        // Theres probably a better way of doing this. 

        for (int i = 0; i < values.length; i++) {
            for (int k = 0; k < values.length; k++) {
                if ((values[i] == values[k]) && (i != k)) {
                    return true;
                }
            }
        }
        return false; 
    }
}
