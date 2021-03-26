import java.util.Scanner;

public class ScannerClassForInput {

	public static void main(String[] args) {
		
		//int a;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter an Integer : ");
		int value = input.nextInt();
		
		System.out.println("You entered " + value);
		
	}
	
}
