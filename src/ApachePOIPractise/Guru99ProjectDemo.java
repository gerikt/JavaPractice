package ApachePOIPractise;

public class Guru99ProjectDemo {

	public static void main(String[] args) {

		Guru99Project guru99project = new Guru99Project();
		
		guru99project.invokeBrowser();
		
		guru99project.Login();
		
		guru99project.addCustomer();
		
		String customerId = guru99project.getCustomerId();
		
		System.out.println("The customer id is : " + customerId);
	}

}
