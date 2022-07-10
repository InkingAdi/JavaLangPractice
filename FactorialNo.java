import java.util.*;

class FactorialNo {
	
	/*
 	* We have to find Factorial of a No. 6!
 	* 6 * 5 * 4 * 3 * 2 * 1 
 	* ALGORITHM
 	* 1. N = ENTER A NO.
 	* 2. WHILE N > 1 	REPEAT STEP 2 TO 4
 	* 3. FACT = FACT * (N - 1)
 	* 4. N = N - 1
 	* 5. PRINT TEMP
 	* 6. END
 	*   */
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	Integer _no = sc.nextInt();
	Integer fact = _no;
	while(_no > 1){
		fact *= _no - 1;
		_no = _no - 1;
	}
	System.out.println("Factorial : "+fact);
	}
}
