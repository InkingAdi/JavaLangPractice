import java.util.*;

class LargeThreeNo{

	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	Integer _1, _2, _3;
	System.out.println("Enter NO: ");
	_1 = sc.nextInt();
	_2 = sc.nextInt();
	_3 = sc.nextInt();
	if(_1 > _2) {	
		if(_1 > _3) {
		System.out.println(_1); 
		}else {
		System.out.println(_3);
		} 
	}else if(_2 > _3) { 
		System.out.println(_2);
	} else { 
		System.out.println(_3);
	}
	//System.out.println(_1 > _2 ? _1 > _3 ? System.out.println(_1):System.out.println(_3) : (_2 > _3) ? System.out.println(_2) : System.out.println(_3));
	}

}
