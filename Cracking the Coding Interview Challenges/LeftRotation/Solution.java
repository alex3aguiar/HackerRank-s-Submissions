import java.util.Scanner;

/*Left Rotation
 * 
 * 
 * A left rotation operation on an array of size n  
 * shifts each of the array's elements 1 unit to the left. 
 * For example, if 2 left rotations are performed on array [1,2,3,4,5], 
 * then the array would become [3,4,5,1,2].
*/

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];

		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		k = k % n;

		if (k != 0) {
			int i = 0;
			int destino = 0;
			int aux1 = a[0];
			int aux2 = a[0];

			for (int x = 0; x < n; x++) {

				if (k > i) {
					destino = n - (k - i);
				} else {
					destino = i - k;
				}
				if (k == n / 2) {

					for (int y = 0; y < n - k; y++) {
						aux1 = a[y];
						a[y] = a[y + k];
						a[y + k] = aux1;
					}

					break;

				}

				aux2 = a[destino];
				a[destino] = aux1;
				i = destino;
				aux1 = aux2;

			}

		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

	}
}