import java.util.*;

class FactorialRecursion {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Integer _num = sc.nextInt();
		System.out.println("Factorial Of "+ _num+":  "+getNumberFactorial(_num));
	
	}

	static Integer getNumberFactorial(Integer _num) {
		
		//Base condition:- Number <= 1	
		if(_num <= 1)
			return _num;

		//6 * (6 -1)
		return _num * getNumberFactorial(_num - 1);
	}
}
