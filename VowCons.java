import java.util.*;

class VowCons{

	public static void main(String args[]) { 

		Scanner sc = new Scanner(System.in);
		Character _ch = sc.next().charAt(0);
		System.out.println(_ch == 'a' || _ch == 'e' || _ch == 'i' || _ch == 'o' || _ch == 'u' ? "Vowels" : "Consonant");
	}

}
