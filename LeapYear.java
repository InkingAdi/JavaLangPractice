import java.util.*;

class LeapYear {

	public static void main(String args[]) {
		
	Integer year;
	Scanner sc = new Scanner(System.in);
	
	System.out.println();
	year = sc.nextInt();
	/*If the year is evenly divisible
 	* If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
 	* If the year is evely divisible by 400, go to step 4. Otherwise, go to step 5.
 	* The year is a leap year (it has 366 days).
 	* The year is not a leap year (it has 365 days). */

	if(year % 2 ==0) {
		if(year % 100 == 0) {
			if(year % 400 == 0) {
				System.out.println("Leap Year");
			} else {
				System.out.println("Not a Leap Year");
			}
		} else {
			System.out.println("Leap Year");
		}
		
	}else {
		System.out.println("Not a Leap Year");
	}
	}

}
