import java.util.*;
import java.lang.*;

class FindRemQuot {

	public static void main(String args[]){

		Double _divisor, _dividend;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A Divisor Value: ");
		_divisor = sc.nextDouble();
		
		System.out.print("Enter A Dividend Value: ");
		_dividend = sc.nextDouble();
		
		System.out.println("Quotient Is: "+(_dividend / _divisor));
		System.out.println("Remainder Is: "+(_dividend % _divisor));
				
	}
}
