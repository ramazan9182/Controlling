import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println("GREATEST COMMON DIVISOR FOR TWO INTEGER");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two integer ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int gcd = 1;
		for(int i = 2; ((i <= number1) && (i <= number2)) ; i++) {
			if( ((number1 % i) == 0)  && ((number2 % i) == 0)) {
				gcd = i;
			}
		}
		System.out.println("GCD : " + gcd);
	}
}
