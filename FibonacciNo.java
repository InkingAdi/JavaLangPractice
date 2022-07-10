import java.util.*;

class FibonacciNo {
	
	/*
 	* To Print the Fibonacci Series.
 	* 0, 1, 1, 2, 3, 5, 8, 13
 	* ALGORITHM 
 	* 1. NUM1 = 0, NUM2 = 1
 	* 2. N = ENTER TILL HOW MANY SERIES YOU WANT TO PRINT
 	* 3. WHILE I < N	REPEAT 3 TO 6
 	* 4. PRINT NUM1 AND PRINT  NUM2
 	* 5. NUM3 = NUM1 + NUM2
 	* 6. NUM1 = NUM2; NUM2 = NUM3;
 	* 7. END   */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Integer Num1=0, Num2=1, N, i = 0;
		N = sc.nextInt();
		System.out.print(Num1+", "+Num2);
		while(i < N){
		Num1 = Num2;
		Num2 = Num1 + Num2;
		System.out.print(", "+Num2);
		i++;
		}
	System.out.println();
	}
}
