package testCases;

import org.testng.annotations.Test;

import pageObjects.MakeMyTripHome;

public class TC_FlightBooking extends BaseTest 
{
  @Test	
  public void BookFlight()
  {
	MakeMyTripHome MMT = new MakeMyTripHome(driver);
	
	MMT.Close();
	MMT.From();
	MMT.To();
	MMT.SelectDate();
	MMT.ClickButton();
  }
}
