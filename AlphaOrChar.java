import java.util.*;

class AlphaOrChar {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Character ch = sc.next().charAt(0);
	Integer _int_ch = Character.getNumericValue(ch);
	if((_int_ch >= 97 && _int_ch <=122) || (_int_ch >=65 && _int_ch <= 90)) { 
	System.out.println(ch+" Is A Alphabet");
	} else {
	System.out.println(ch+" Is a character");
	}
	}
}
