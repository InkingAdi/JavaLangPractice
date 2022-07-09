import java.util.*;

class EvenOdd {

	public static void main(String args[]) {

	Integer num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	num = sc.nextInt();
	System.out.println((num % 2 == 0 ? "Even" : "Odd"));
		
	}
}
