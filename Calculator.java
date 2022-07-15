import java.util.*;

class Calculator {

	public static void main(String args[]) {

		Integer _choice, _no_1, _no_2;
		System.out.println("Enter Two No. To Be Added:  ");
		_no_1 = new Scanner(System.in).nextInt();	
		_no_2 = new Scanner(System.in).nextInt();	
		System.out.println("Enter Your Choice: \n1: ADDITION \n2: SUBRATCTION \n3: MULTIPLICATION \n4: DIVIDE\n5: REMAINDER");
		_choice = new Scanner(System.in).nextInt();
		switch(_choice) {

			case 1: {
				System.out.println("Addition: "+(_no_1 + _no_2));
				break;
			}
			case 2: {
				System.out.println("Subtraction: "+(_no_1 - _no_2));
				break;
			}
			case 3: {
				System.out.println("Multiplication: "+(_no_1 * _no_2));
				break;
			}
			case 4: {
				System.out.println("Divide: "+ (_no_1 / _no_2));
				break;
			}
			case 5: {
				System.out.println("Remainder: "+(_no_1 % _no_2));
				break;
			}
			default:{
				System.out.println("Please Enter Valide Choice: ");
				break;
			}
		}
		

	}
}
