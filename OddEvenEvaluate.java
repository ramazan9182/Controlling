import java.util.Scanner;

public class OddEvenEvaluate {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter in a integer : ");
		int value = input.nextInt();
		
		if((value % 2) == 0) {
			System.out.println("The value is even");
		}else {
			System.out.println("The value is odd");
		}
		
	}

}
