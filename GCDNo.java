 import java.util.*;

class GCDNo {
	/*
 	* Find GCD of two Number
 	* a = 13, b = 48  There are two ways to find GCD of two no.
 	* 1. divide both no. from 1 to greater from both no. If both no. will be divisible then it will print that no. or it will print 1. 
 	* 2. Subtracting smaller no. from greater no. till it is not equal to smaller no. If equal then will print the GCD is smaler no.
 	* ALGORITHM
 	* 1. N = ENTER A NUMBER
 	* 2. for i = 1; i <= N1 && i <= N2; i++ 
 	* 3. if n1 % i == 0 n2 % i == 0
 	* 4. PRINT I
 	* 5. END  */
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	Integer _N1, _N2, _GCD = 1;
	_N1 = sc.nextInt();
	_N2 = sc.nextInt();
	for(int i = 1; (i <= _N1) && (i <=_N2); i++) {

		if(_N1 % i == 0 && _N2 % i == 0) {
		
			_GCD =i;	
	
		}
	
	}
	System.out.println("GCD is : "+_GCD); 	
	}

}
