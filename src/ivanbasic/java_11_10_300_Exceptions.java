package ivanbasic;

public class java_11_10_300_Exceptions implements Lesson {

	@Override
	public  void main() {
		 int returned;	
		
		 
		 System.out.println("Without trow ");		 
		 returned = goHome();
		 System.out.println("Returned " +returned);

		 System.out.println("\n\n");					 
		 
		 System.out.println("With trow ");				 
		 returned = goHomeWithTrow();
		 System.out.println("Returned " +returned);		 
		 
	}
	
	
	@SuppressWarnings("finally")
	int goHome() {
		try {
			// Optionally throw an exception here
			System.out.println("1");
			return  inReturnLine( -1 );
		} catch (Exception e) {
			System.out.println("2");
			return inReturnLine(-2);
		} finally {
			System.out.println("3");
			return inReturnLine(-3);
		}
	}

	@SuppressWarnings("finally")
	int goHomeWithTrow() {
		try {
			// Optionally throw an exception here
			throw new Exception();
			//System.out.println("1");
			//return inReturnLine(-1);
		} catch (Exception e) {
			System.out.println("2");
			return inReturnLine(-2);
		} finally {
			System.out.println("3");
			return inReturnLine(-3);
		}
	}	
	
	
	int inReturnLine(int ii) {
		System.out.println("In return line, "+ii);
		return ii;
	}
	
}
