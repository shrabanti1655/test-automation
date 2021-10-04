package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Cucumber.Automation.Base;

public class FormPage extends Base{
	
	
	public FormPage(WebDriver driver)
	{
		Base.driver=driver;
	}
	
	String hobbiesVal,genderValue;
	
	By firstName=By.xpath("//input[@id='firstName']");
	By lastName=By.xpath("//input[@id='lastName']");
	By email=By.xpath("//input[@id='userEmail']");
	By gender=By.xpath("//div//*[@class='custom-control-label'][text()='"+ genderValue +"']"); 
	By mobile=By.xpath("//input[@id='userNumber']");
	By dateOfBirth=By.xpath("//input[@id='dateOfBirthInput']");
	By subjects=By.xpath("//div[@id='subjectsContainer']");
	//label[text()='Music']
	By hobbies=By.xpath("//label[text()='"+ hobbiesVal +"']");
	By currentAddress=By.xpath("//textarea[@id='currentAddress']");
	By submit=By.xpath("//button[@id='submit']");

	public WebElement getFirstName()
	{
		return driver.findElement(firstName);
		
	}
	
	public WebElement getLastName()
	{
		return driver.findElement(lastName);
	}
	public WebElement getGender(String genderVal)
	{
		
		return driver.findElement(By.xpath("//label[text()='"+ genderVal +"']"));
	}
	public WebElement getMobile()
	{
		return driver.findElement(mobile);
	}
	
	public WebElement submitForm()
	{
		return driver.findElement(submit);
	}
}
 