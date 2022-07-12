import java.util.*;

class Palindrome {
	/*
 	* We have to See whether a no. is Palinrome or not
 	* We have to reverse a given no. and then compare with original no.
 	* ALGORITHM
 	* 1. N = ENTER A NO
 	* 2. TEMP = N
 	* 3. WHILE TEMP != 0	REPEAT STEP 4 TO 5
 	* 4. TEMP_2 = TEMP_2 * 10 + (TEMP % 10)
 	* 5. TEMP = TEMP / 10
 	* 6. IF TEMP_2 == N
 	* 7. PRINT PALINDROME
 	* 8. ELSE 
 	* 9. PRINT NOT PALINDROME
 	* 10. END*/
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Integer _num = sc.nextInt();
	Integer _temp = _num, _temp_2 = 0;
	while(_temp != 0) {
		_temp_2 = _temp_2 * 10 +( _temp % 10); 
		_temp = _temp / 10;
	}
	if(_temp_2 == _num) {
		System.out.println("Given Number Is Palindrome");
	}else {
		System.out.println("Given Number Is Not Palindrome");
	}
	}
}
