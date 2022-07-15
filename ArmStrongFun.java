import java.util.*;

class ArmStrongFun {

	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	Integer _int = sc.nextInt();
 	Integer _int_2 = sc.nextInt();
	while(_int < _int_2) {
		System.out.println(getArmStrongNo(_int)+" Is ArmStrong No.");
		_int++;
	}	
	}

	static Integer getArmStrongNo(Integer _no) {
		Integer temp = _no;
		Double _arm = 0.0;
		while(temp > 0) {
			_arm += Math.pow((temp % 10), 3);
			temp = temp / 10;	
		}
		
		if((int)Math.round(_arm) == _no) {
			return _no;
		}else {
			return null;
		}
		
	}
}
