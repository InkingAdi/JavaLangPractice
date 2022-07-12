import java.util.*;

class ReverseNo {
	/*
 	* We have to reverse the No. of any length 
 	* ALGORITHM
 	* 1. N = ENTER A VALUE
 	* 2. REV = 0
 	* 3. WHILE N > 0
 	* 4. TEMP = N % 10
 	* 5. REV = REV * 10 + TEMP
 	* 6. N = N / 10
 	* 7. PRINT REV
 	* 8. END */
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		Integer temp = 1, rev = 0;
		while(num != 0) {
			temp = num % 10;
			rev = (rev * 10 ) + temp;
			num = num / 10;
		}
		System.out.println("Reversed No. Is: "+rev);
	}
}
