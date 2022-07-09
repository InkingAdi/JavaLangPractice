import java.util.*;

class FindASCIIValue { 

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Character _char ;
		System.out.println("Enter A Character which you want to find the ASCII value : ");
		_char = sc.next().charAt(0);
		int _int = Character.getNumericValue(_char);
		System.out.println("ASCII Value: "+_int);
	}


}
