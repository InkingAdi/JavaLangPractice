import java.util.*;

class PrimeNo {
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	Integer num = sc.nextInt();
	Boolean flag = true;
	if(num >= 1){
	
		for(int i = 1; i < num / 2; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			} 	
		}
		if(flag == true) {
			System.out.println("Given No Is Prime No");
		}else {
			System.out.println("Given No Is Not A Prime No");
		}
	}else {
	System.out.println("Provided No is Not a Whole No.");	
	}

	}


} 
