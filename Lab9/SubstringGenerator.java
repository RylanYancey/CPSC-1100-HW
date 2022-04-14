import java.util.ArrayList;
import java.util.Collections;

/*
	Lab9 - Recursive Function for finding all substrings of an array 
	note: my function is different from the way Professor Muhammed says to do it. Results look slightly different but are still valid.
	This function has two parts, getSubstrings and findAllSubstrings. getSubstrings is a helper function for setting up and calling the recursive function, findAllSubstrings.
	findAllSubstrings keeps the parameters letter and travel. letter refers to the substring start, and travel to the substring end. 
	word in findAllSubstrings never changes.
	First, we get the new string using letter and travel.
	if letter is equal to the length of the word, we know that we have found all the substrings and can return the arraylist.
	if new_string == "", we know that letter = travel and we need to increase the letter by one and reset travel, foregoing adding "" to the array.
	if neither of the previous ifs and valid, we need to add new_string to the arraylist and continue the loop, iterating travel down.

	The way to approach recursive problems is to ask; what happens *for every iteration* of the recursive function? And what needs to change, for every iteration?
*/

/**
 * Class containing methods for generating and finding substrings.
 */
public class SubstringGenerator {
	/**
	 * Finds all possible substrings for a given word.
	 * @param word -> the word you want to find all substrings for.
	 * @return -> an ArrayList<String> with all the substrings.
	 */
	public static ArrayList<String> getSubstrings(String word) {
		ArrayList<String> result = findAllSubstrings(new ArrayList<String>(), 0, word.length(), word);
		result.add(""); // done to make the output look exactly like the test output. not necessary.
		Collections.reverse(result); // ^^ not necessary.
		return result;
	}

	/**
	 * Actual recursive method for finding all substrings of a string.
	 * @param strings -> the array we are filling up.
	 * @param letter -> the current index of the string we are starting with, or the 'begin index' of the substring.
	 * @param travel -> the 'end index' of the substring.
	 * @param word -> the word in question.
	 * @return an arrayList<String> with all the substrings.
	 */
	private static ArrayList<String> findAllSubstrings(ArrayList<String> strings, int letter, int travel, String word) {
		if (letter == word.length())
			return strings;
		if (letter == travel)
			return findAllSubstrings(strings, letter += 1, word.length(), word);
		strings.add(word.substring(letter, travel));
		return findAllSubstrings(strings, letter, travel -= 1, word);
	}
}
