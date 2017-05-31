import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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

			for (int x = 0; x < n ; x++) {

			

				if (k > i) {
					destino = n - (k - i);
				} else {
					destino = i - k;
				}
                if (k==n/2) {
                   
                    for (int y = 0; y < n-k; y++) {
                        aux1 = a[y];
                        a[y] = a[y+k];
                        a[y+k] = aux1;
                    }
                    
                   
                    break;
                    
				}
                
				aux2 = a[destino];
				a[destino] = aux1;
				i = destino;
				aux1 = aux2;

			}

		}

		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

		System.out.println();

	}
}