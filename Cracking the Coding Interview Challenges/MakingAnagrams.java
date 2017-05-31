import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static int numberNeeded(String first, String second) {
		int numberNeeded = 0;

		int x = 0;
		int y = 0;
		do {
			if(first.charAt(x)!= second.charAt(y)){
				if (first.charAt(x) > second.charAt(y)) {
					x--;
					numberNeeded++;
				}else{
					y--;
					numberNeeded++;
				}
					
			}
			System.out.println("numberNeeded = "+ numberNeeded+"  x = "+ x+"  y="+ y);
				
			x++;
			y++;
		} while ((x < first.length()) && (y < second.length()));
		System.out.println("tamanho x"+first.length()+"  x"+x+"   tamanho y"+second.length()+"  y"+y);
		
		numberNeeded +=  first.length() -x +second.length() - y;
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
		resultado = numberNeeded(Organizado(a), Organizado(b)) ;
		System.out.println(resultado);

	}
}
