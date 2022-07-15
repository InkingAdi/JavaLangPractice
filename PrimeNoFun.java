import java.util.*;

class PrimeNoFun {

	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	Integer _int = sc.nextInt();
	Integer _int_2 = sc.nextInt();
	while(_int < _int_2) {
			System.out.println(_int+" "+find_prime_no( _int));
		_int++;
	}
	
	}

	static String find_prime_no(Integer _no) {
	Boolean _isPrime = false;		
	for(int k = 2; k < _no/2; k++) {
			if(_no % k ==0){
				_isPrime = true;
			}
		
	}
	if(_isPrime == false){
		return "IsPrime";
	}else {
		return "NotPrime";
	}
	}


}
