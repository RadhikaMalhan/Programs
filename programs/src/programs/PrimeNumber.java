package programs;

public class PrimeNumber {
     public static boolean isPrimenumber(int num) {
    	if(num<=1)
    	{    return false;
    	} for (int i=2;i <=num;i++) {
    		if (num % i==0) {
    			return false;
    		}
    	}
    	return true;
     }
	public static void main(String[] args) {
		// prime number which can be divided by only itself.eg. 13,5,7,3,2 and so on.
		//2 is lowest prime number.
		System.out.println(isPrimenumber(60));
	}
}
