package programs;

public class FactorialNumber {
	// fact of 3=3*2*1=6 and so on
	//fact of 0 is 1
	// without recursive use of for loop
	public static int factorial(int num) {
		int fact=1;
		for (int i=1;i<=num;i++) {
			fact=fact*i;	}
		return fact;
	}
	
	// with recursive function: a function calling itself
	 public static int fact(int num) {
		 if(num==0)
			 return 1;
		 else return(num*fact(num-1));
	 }
	public static void main(String[] args) {
		 System.out.println(factorial(5));
		 System.out.println(fact(5));
	}

}
