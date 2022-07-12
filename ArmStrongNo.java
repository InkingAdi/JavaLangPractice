import java.util.*;

class ArmStrongNo {
	
	/*
 	* We have to check whether a no. is ARMSTRONG OR NOT. So we have to take one digit cube it and add the cube of that digit and check whether it is equal to the given no or not.
 	* ALGORITHM
 	* 1. N = ENTER A NO
 	* 2. TEMP = N
 	* 3. WHILE N > 0
 	* 4. NUM = N % 10
 	* 5. SUM = SUM + Math.pow(NUM , 3)
 	* 6. N = N / 10
 	* 7. IF SUM == NUM 
 	* 8. PRINT NUM IS ARMSTRONG NO.
 	* 9. ELSE 
 	* 10. PRINT NUM IS NOT ARMSTRONG NO.
 	* 11. END*/
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Integer _int = sc.nextInt();
		Integer _temp = _int;
		Double  _num = 0.0;
		while(_temp > 0) {
			_num = _num + Math.pow((_temp % 10), 3);
			_temp = _temp / 10;
		}
		if((int)Math.round(_num) == _int) {
			System.out.println("Given No Is Armstrong");
		} else {
			System.out.println("Given No. Is Not Armstrong");
		}
	}
}
