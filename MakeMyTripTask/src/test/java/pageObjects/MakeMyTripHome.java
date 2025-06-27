package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MakeMyTripHome extends BasePage
{
    //Constructor
	public MakeMyTripHome(WebDriver driver) 
	{
		super(driver);
	}
  
    //Locators
	@FindBy(xpath = "//span[@data-cy='closeModal']")                                  WebElement Close;
	@FindBy(xpath = "//label[@for='fromCity']")                                       WebElement FromCity;
	@FindBy(xpath = "//input[@placeholder='From']")                                   WebElement From;
	@FindBy(xpath = "//span[text()='New Delhi']")                                     WebElement CityName1;
	@FindBy(xpath = "//label[@for='toCity']")                                         WebElement ToCity;
	@FindBy(xpath = "//input[@placeholder='To']")                                     WebElement To;
	@FindBy(xpath = "//span[text()='Mumbai']")                                        WebElement CityName2;
	@FindBy(xpath = "//div[@aria-label='Sat Jun 28 2025']//p[contains(text(),'28')]") WebElement Date;
	@FindBy(xpath = "//a[text()='Search']")                                           WebElement SearchButton;
	
	//Methods
	public void Close()
	{
		Close.click();
	}
	
	public void From()
	{
	  FromCity.click();
	  From.sendKeys("New Delhi");
	  CityName1.click();
	}
	
	public void To()
	{
		ToCity.click();
		To.sendKeys("Mumbai");
		CityName2.click();
	}
	
	public void SelectDate()
	{
		Date.click();
	}
	
	public void ClickButton()
	{
		SearchButton.click();
	}




}
