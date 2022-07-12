import java.util.*;

class CalcPower {

	/*
 	* We have to find the power of a no. 
 	* We can implement it in two ways :
 	* i. Using Math.pow(number, power)
 	T* ii. Using ForLoop and multiplying it with itself.
 	* ALGORITHM:
 	* 1. N = ENTER A NO
 	* 2. POW = ENTER A POWER
 	* 3. PRINT MATH.POW(N,POW)
 	* 4. END
 	*
 	* ALGORITHM 2
 	* 1. N = ENTER A NO
 	* 2. POW = ENTER A POWER
 	* 3. I = 1
 	* 4. WHILE I < POW
 	* 5. TEMP = */
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		Integer _no = sc.nextInt();
		System.out.println("Enter power to that No.");
		Integer _pow = sc.nextInt();
//		System.out.println("Power of a No. Is: "+Math.pow(_no,_pow));
		Integer Temp = 1;
		for(int i = 1; i <= _pow; i++) {
		Temp = Temp *_no;					
		}
		System.out.println(Temp);
	}


}
