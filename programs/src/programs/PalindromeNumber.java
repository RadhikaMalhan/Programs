package programs;

public class PalindromeNumber {
 //151,454,34543,161,78987
	public static void isPalindromeNumber(int num) {
		int r=0;
		int sum=0;
		int t;
		t=num;
		while(num>0) {
			r=num%10;// to get the remainder
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("this is palindrome number");
		}
		else {
			System.out.println("this is not palindrome number");
		}
	}
	public static void main(String[] args) {
		
		isPalindromeNumber(151);
	}

}
