
// GOTO _?
// return, break, continue // unconditional branching

public class Branching {

	public static void main(String[] args) {

		for (int i = 0; i < 10 && ((i % 2) == 0); i ++) {
			
			System.out.println(i);
			
		}

		// [0,9]

//		for (int i = 0; i < 10; i++) {
//			if ((i % 2) == 0) {
//				System.out.println(i);
//			}
//		}

//		for (int i = 0; i < 10; i++) {
//			if ((i % 2) != 0) continue;
//			System.out.println(i);
//		}

//		for (int i = 0; i < 10; i++) {
//			if(i == 5){
//				continue;
//			}
//			System.out.println(i);
//		}

		// ==== break

//		for(int i = 0; i < 10; i++) {
//			if(i > 3) {
//				break;
//			}
//			System.out.println(i);
//		}
//		
//		System.out.println("Continue Running...");

		{
//			for (int i = 0; i < 10; i++) {
//				if (i > 3) {
//					return;
//				}
//				System.out.println(i);
//			}
		}
//		System.out.println("Continue Running...");

		{
			
		}
		
		// return; // void methods have implicit return statement
	} // END OF METHOD
}
