package tests;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GooglePage;

public class searchTest extends TestBase{
	GooglePage test;
	
	@BeforeTest
	//define object from google page
	public void intializeObjets() {
		test = new GooglePage(driver);
	}

	@Test(priority = 1)
	public void fillForm() throws InterruptedException, IOException {
		test.Form();
		test.Form();
	}
	@Test(priority = 2)
	    public void validateTableData() {
	    List<WebElement> rows = test.table.findElements(By.tagName("tr"));
	    WebElement lastRow = rows.get(rows.size() - 1);
	    List<WebElement> cells = lastRow.findElements(By.tagName("td"));
	        if (rows.size() < 2) {
	            return;
	        }
	        String lastRowCarNumber = cells.get(0).getText();
	        String lastRowFuelInGalon = cells.get(1).getText();
	        String lastRowCompanyID = cells.get(5).getText();
	        System.out.println("Last Row - CarNumber: " + lastRowCarNumber +
	                ", FuelInGalon: " + lastRowFuelInGalon +
	                ", CompanyID: " + lastRowCompanyID);
	        AssertJUnit.assertEquals(lastRowCarNumber, "44444444");
	        AssertJUnit.assertEquals(lastRowFuelInGalon, "40");
	        AssertJUnit.assertEquals(lastRowCompanyID, "1010");
	    }


	}