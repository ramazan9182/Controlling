import java.util.Scanner;

public class SimpleSubtractionQuizFoorLoop {

	public static void main(String[] args) {

		System.out.println("Welcome to the Simple Quiz *** !!");
		Scanner input = new Scanner(System.in);
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		if (number1 < number2) {
			number2 = number1 + number2;
			number1 = number2 - number1;
			number2 = number2 - number1;
		}
		
		System.out.println("Here your question : ");
		
//		int answer = -1;
//		for (; (number1 - number2) != answer; ) {
//			System.out.println("What is " + number1 + " - " + number2 + " ?");
//			answer = input.nextInt();
//		}
		
		for (int answer = -1; (number1 - number2) != answer; answer = input.nextInt()) {
			System.out.println("What is " + number1 + " - " + number2 + " ?");
		}

		System.out.println("Yeeaapp !");
	}
}
