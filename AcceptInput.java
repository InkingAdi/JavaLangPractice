import java.util.*;
import java.lang.Exception;

class AcceptInput{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Integer _int;	String _string;		Double _double;		Boolean _bool;		Character _char;
 
		try{

		System.out.print("Enter A Integer: ");		
		_int = sc.nextInt();
		sc.nextLine();
		System.out.print("\nEnter A String: ");
		_string = sc.nextLine();

		System.out.print("\nEnter A Double Value: ");
		_double = sc.nextDouble();
		
		System.out.print("\nEnter A Character Value: ");
		_char = sc.next().charAt(0);
		
		System.out.print("\nEnter A Boolean Value: ");		
		_bool = sc.nextBoolean();

		System.out.println("Integer: "+_int+"\nString: "+_string+"\nDouble: "+_double+"\nBoolean: "+_bool+"\nCharacter: "+_char);
		} catch(Exception e){
			System.out.println(e+" Exception Occured");
		}
	}
}
