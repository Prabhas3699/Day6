import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {

		/*
		 * getting input for user
		 */
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		/*
		 * boolean data structure to get true or flase
		 */
		boolean prime = true;
		for(int i=2; i<number; i++) {
			if (number%i == 0) {
				prime = false;
				break;
			}
			}if (prime == true){
				System.out.println("The Number is prime");
			
			}else {
				System.out.println("The Number is not prime");
			}
			
	}

}
