
public class ReverseNumber {

	public static void main(String[] args) {
		
		//initiating variables
		int num = 456;
		int rev=0;
		int i;
		
		//using while function to iterate multiple values
		while(num>0) {
			i=num%10;
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

}
