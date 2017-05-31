
import java.util.*;

/*Making Anagrams
 * 
 *Given two strings,  and , that may or may not be of the same length, 
 *determine the minimum number of character deletions required to make 
 * and  anagrams. Any characters can be deleted from either of the strings.
*/

public class Solution {
	public static int numberNeeded(String first, String second) {
		int numberNeeded = 0;

		int x = 0;
		int y = 0;
		do {
			if (first.charAt(x) != second.charAt(y)) {
				if (first.charAt(x) > second.charAt(y)) {
					x--;
					numberNeeded++;
				} else {
					y--;
					numberNeeded++;
				}

			}

			x++;
			y++;
		} while ((x < first.length()) && (y < second.length()));

		numberNeeded += first.length() - x + second.length() - y;
		return numberNeeded;

	}

	public static String Organizado(String a) {

		char[] chars = a.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		return sorted;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		int resultado = 0;
		resultado = numberNeeded(Organizado(a), Organizado(b));
		System.out.println(resultado);

	}
}
