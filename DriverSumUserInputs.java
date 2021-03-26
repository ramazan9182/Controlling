import java.util.Scanner;

public class DriverSumUserInputs {

	
	public static void main(String[] args) {
		
		int sum = 0;
		Scanner input = new Scanner(System.in);
		int count = 0;
		while(count < 3) {
			System.out.println("Please enter an integer : ");
			sum += input.nextInt();
			count++;
		}
		System.out.println("SUM : " + sum);
	}
}
