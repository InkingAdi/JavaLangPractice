import java.util.*;

class SwapTwoNo {

	public static void main(String args[]) {

	Integer _num_one, _num_two, _num_three;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter The First No.: ");
	_num_one = sc.nextInt();
	System.out.print("Enter The Second No.: ");
	_num_two = sc.nextInt();

	_num_three = _num_one;
	_num_one = _num_two;
	_num_two = _num_three;
	
	System.out.println("NUM ONE: "+_num_one+"\nNUM TWO: "+_num_two);
	
	}

} 
