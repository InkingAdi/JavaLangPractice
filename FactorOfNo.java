import java.util.*;

class FactorOfNo {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Integer _int = sc.nextInt();
		int i = 1;
		System.out.print("Factor Of " + _int+":   ");
		while(i <= _int) {
			
			if(_int % i ==0) {
				System.out.print(i+" ");  
			}
			i++;
		}
		System.out.println();
	}
}
