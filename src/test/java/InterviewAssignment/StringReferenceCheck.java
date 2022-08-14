package InterviewAssignment;

public class StringReferenceCheck {

	public static void main(String[] args) {
		StringReferenceCheck.checking();
		
	}
	public static boolean checking() {
		String first = "Test";
		String second = new String("Test");
		String third="Test";
		if (first == third) {
			System.out.println("its true");
		 return true;
		}
		else {
			System.out.println("its false");
		 return false;
		}

	}
}

