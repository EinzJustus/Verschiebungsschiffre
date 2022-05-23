package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	static String[] alphabet = { "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z" };
	static String C ="";
	public static void main(String[] args) {
		
		System.out.println("Bitte geben sie ihr Passwort ein.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			
			String[] P = br.readLine().toLowerCase().split("");
			
			System.out.println("Bitte geben sie ihren Key ein.");
			
			int K = Integer.parseInt(br.readLine());
			
			Create(P, K, alphabet );
			System.out.println(C);
			
		} catch (IOException e) {

			e.printStackTrace();
		}

}
	
	public static void Create(String[] P, int K, String[] A) {
		for (int i = 0; i < P.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if(A[j].equals(P[i])){
					C+=A[(j+K)%A.length];
				}
			}
			
		}
	}
}
