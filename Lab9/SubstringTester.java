import java.util.ArrayList;

public class SubstringTester {
	public static void main(String[] args) {
		ArrayList<String> substrings = SubstringGenerator.getSubstrings("ab");
		System.out.println("Substrings of \"ab\"");
		System.out.print("Actual:   ");
		for (String s : substrings) {
			System.out.print("'" + s + "' ");
		}
		System.out.println();
		System.out.println("Expected: '' 'b' 'a' 'ab'");
		System.out.println();
		
		
		substrings = SubstringGenerator.getSubstrings("abc");
		System.out.println("Substrings of \"abc\"");
		System.out.print("Actual:   ");
		for (String s : substrings) {
			System.out.print("'" + s + "' ");
		}
		System.out.println();
		System.out.println("Expected: '' 'c' 'b' 'bc' 'a' 'ab' 'abc'");
		System.out.println();
		
		
		substrings = SubstringGenerator.getSubstrings("rum");
		System.out.println("Substrings of \"rum\"");
		System.out.print("Actual:   ");
		for (String s : substrings) {
			System.out.print("'" + s + "' ");
		}
		System.out.println();
		System.out.println("Expected: '' 'm' 'u' 'um' 'r' 'ru' 'rum'");
		System.out.println();
		
		
		
		System.out.println("Substrings of \"abc123\"");
		substrings = SubstringGenerator.getSubstrings("abc123");
		System.out.print("Actual:   ");
		for (String s : substrings) {
			System.out.print("'" + s + "' ");
		}
		System.out.println();
		System.out.println("Expected: '' '3' '2' '23' '1' '12' '123' 'c' 'c1' 'c12' 'c123' 'b' 'bc' 'bc1' 'bc12' 'bc123' 'a' 'ab' 'abc' 'abc1' 'abc12' 'abc123'");
	}
}

