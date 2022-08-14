package InterviewAssignment;

public class ExceptionCheck {

	public static void main(String[] args) {
		
		
		int a=0, b=10, c=100;
		try{
			//int a=0, b=10, c=100;
			b=b/a;
			c=a/c;
			System.out.println("try block");
			}
		catch(ArithmeticException e){
			
			 a=b/c;
			 System.out.println("****");
			 try {
			 c=b/a;
			 }catch(Exception e1) {
			 System.out.println("catch");
			 }
			}
		 finally {
			// System.out.println("hello");
			 System.out.println("&&&&&");
		 }
		
		

	}

}
