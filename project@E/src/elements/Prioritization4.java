package elements;

import org.testng.annotations.Test;

public class Prioritization4 {


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
	@Test
	public void Kalakatta()
	{
		System.out.println("Kali");
	}
	
	
	
	//#Result
	//Hanuamthu =(priority=0)
	//chinnarao = (priority=0)
	//Kali=@Test no priorty
	//Harishrao=(priority=1)
	//PASSED: Chitturu
	//PASSED: Kalakatta
	//PASSED: Hydrabad
	//PASSED: Amerpet
	
	
	
}
