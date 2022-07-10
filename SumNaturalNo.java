import java.util.*;

class SumNaturalNo {
	
	public static void main(String args[]) {
	
	/* Sum Of Natural No.
 	*  ALGORITHM:
 	*  1. N = ENTER VALUE OF N
 	*  2. N > 0	REPEAT STEP 4
 	*  3. TEMP += N % 10
 	*  4. N = N / 10
 	*  5. PRINT TEMP  	*/	
	Scanner sc = new Scanner(System.in);
	Integer n = sc.nextInt();
	Integer temp = 0;
	if(n > 0) {
	int i = n;
	while(i > 0) {
		temp += (i % 10);
		i = i/10;
	}
	System.out.println("Sum Of Natural No Is: "+temp);
	} else {
		System.out.println("Not Natural No.");
	}
	}
}
