package elements;

import org.testng.annotations.Test;

public class Prirotization2 {

	@Test(priority=0)
	public void Amerpet()    
	
	{
		System.out.println("Hanuamthu");
	}
	@Test(priority=1)
	public void Hydrabad()
	{
		System.out.println("Harishrao");
	}
	@Test(priority=0)
	public void Chitturu()
	{
		System.out.println("chinnarao");
	}
	@Test(priority=2)
	public void Kalakatta()
	{
		System.out.println("Kali");
	}
	
	
	
	
	//# Reslut 
	
	//Hanuamthu
	//chinnarao
	//Harishrao
	//PASSED: Hydrabad
	//PASSED: Chitturu
	//PASSED: Amerpet
	
	
}
