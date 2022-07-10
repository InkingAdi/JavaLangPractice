import java.util.*;

class Multiplication {
	
	/*
 	* Generate Multiplication Table
 	* ALGORITHM
 	* 1. N = ENTER A VALUE
 	* 2. I = 1
 	* 3. WHILE I <= 10 	REPEAT STEP 4
 	* 4. PRINT N * I 
 	* 5. END 	*/
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Integer _n = sc.nextInt();
		Integer _i = 1;
		while (_i <= 10) {
			System.out.println(_n+" * "+_i +" = "+(_n * _i));
			_i++;
		}	
	}

}
