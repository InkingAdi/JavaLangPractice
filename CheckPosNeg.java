import java.util.*;

class CheckPosNeg {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	Integer num;
	System.out.println("Enter a no.: ");
	num = sc.nextInt();
	if(num > 0) {
		System.out.println("Number is Positive");
	}else {
		System.out.println("Number is Negative");
	}
	}

}
