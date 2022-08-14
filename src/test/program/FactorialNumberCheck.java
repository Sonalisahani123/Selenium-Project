import org.testng.annotations.Test;

public class FactorialNumberCheck {

   
	
	
	@Test
	public void main(String[] args) {
		//5!=1*2*3*4*5
		int n=5,fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
          System.out.println("factorial of a number:" + fact);
	}

	
	
}
