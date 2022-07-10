 import java.util.*;

class CountDigits {
	
	/*
 	* Count No. Of Digits
 	* We have to divide Given Number by 10 till it become 0 and in each loop we will count how many times loop is executing.
 	* ALGORITHM
 	* 1. N = Enter a No.
 	* 2. WHILE N > 0
 	* 3. 	N = N / 10
 	* 4. Count++
 	* 5. PRINT Count
 	* 6. END  */
	public static void main(String args[]) {

		Integer digit, count = 0;
		Scanner sc = new Scanner(System.in);
		digit = sc.nextInt();
		while(digit > 0) {
			digit = digit / 10;
			count++;
		}			
		System.out.println(count);
	}


}
