import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Ransom Note
 * 
 * Given the words in the magazine and the words in the ransom note, print Yes
 * if he can replicate his ransom note exactly using whole words from the
 * magazine; otherwise, print No.
 * https://www.hackerrank.com/challenges/ctci-ransom-note
 */

public class Solution {

	public static boolean Verifica(ArrayList<String> magazine, ArrayList<String> ransom, int m, int n) {
		int contador = 0;
		for (String ransoms : ransom) {
			if (magazine.contains(ransoms)) {
				contador++;
				magazine.remove(ransoms);
			} else {
				if (m == n) {
					return false;
				}
			}
		}
		if (contador == ransom.size()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> magazine = new ArrayList<String>();
		ArrayList<String> ransom = new ArrayList<String>();
		int m = in.nextInt();
		int n = in.nextInt();
		for (int x = 0; x < m; x++) {
			magazine.add(in.next());
		}
		for (int x = 0; x < n; x++) {
			ransom.add(in.next());
		}
		Collections.sort(magazine);
		Collections.sort(ransom);
		if (Verifica(magazine, ransom, m, n)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}