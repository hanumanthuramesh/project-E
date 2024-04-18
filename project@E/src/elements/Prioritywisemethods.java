package elements;

import org.testng.annotations.Test;

public class Prioritywisemethods {
	@Test(priority=1)
	public void Telangana()    
	
	{
		System.out.println("Hanuamthu");
	}
	@Test(priority=0)
	public void Hydrabad()
	{
		System.out.println("Ramesh");
	}
	@Test(priority=0)
	public void Madhapur()
	{
		System.out.println("army");
	}
	
	
}
