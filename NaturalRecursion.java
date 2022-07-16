import java.util.*;

class NaturalRecursion {

	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		Integer _num = sc.nextInt();	
		System.out.println("Sum Of Natural No:- "+getSumOfNaturalNo(_num));

}
	//10 -> 10 + (10-1)
	static Integer getSumOfNaturalNo(Integer num){
		
//What is the smallest input value -> 0 
		if(num <= 1 )
			return num;
		
		return num + getSumOfNaturalNo(num - 1);
	}

}
