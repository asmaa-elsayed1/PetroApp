package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePage extends PageBase {

	public GooglePage(WebDriver driver) {
		super(driver);
	}
	//Google Page

	@FindBy(name = "carNumber")
	WebElement carNumber;
	@FindBy(name = "fuelInLiters")
	WebElement fuelInLiters;
	@FindBy(name = "fuelCost")
	WebElement fuelCost;
	@FindBy(name = "fuelType")
	public WebElement fuelType;
	@FindBy(name = "dateAndTime")
	WebElement dateAndTime;
	@FindBy(name = "companyId")
	 WebElement companyId;
	@FindBy(xpath = "//form/button")
	WebElement saveBTN;
	@FindBy(xpath = "//div/table[@class=\"table table-striped\"]")
	public WebElement table;

	
	    public void Form() {
	    	sendvalues(carNumber, "1234");
	    	sendvalues(fuelInLiters, "40");
	    	sendvalues(fuelCost, "500");
	    	sendvalues(fuelType, "Gaz");
	    	sendvalues(dateAndTime, "09022013");
	     	dateAndTime.sendKeys(Keys.ARROW_RIGHT);
	    	dateAndTime.sendKeys("11");
	    	dateAndTime.sendKeys(Keys.ARROW_RIGHT);
	    	dateAndTime.sendKeys("10");
	    	sendvalues(companyId, "1010");
	    	click(saveBTN);
	    }
}
