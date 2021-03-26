
public class IfElse {

	public static void main(String[] args) {
		/**
		 * 
		 *  
		 *  if(boolean expression){
		 *  	if boolean_expression is TRUE
		 *  }else{
		 *  	if boolean_expression is FALSE
		 *  }
		 */
		
		int a = 10;
		int b = 3;
		
		if(a > b) {
			System.out.println("Running");
		}
		
		System.out.println("Continue Running");
		
		
		if( !(a > b)) {
			System.out.println("If block is running");
		}else {
			System.out.println("Else block is running");
		}
		
		System.out.println("Continue Running 2");
		
		
	}
}
