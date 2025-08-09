package product;

import org.testng.annotations.Test;


import org.testng.Assert;


import PomRepogetry.Homepage;
import genricUtility.BaseClass;

public class Verifyproduct extends BaseClass {
	
	
	
	
	@Test(priority=1 , description=" serach a product and verify same product ")
	public void verifyProduct() throws InterruptedException {
		test = extent.createTest("Verify Product Search");
		Homepage home = new Homepage(driver);
		Thread.sleep(2000);
		
		home.clickproduct();
		System.out.println("click on product ");
		Thread.sleep(2000);
		 Assert.assertTrue(
				 home.isSearchedProductsHeadingVisible(),
		            "'Searched Products' heading is not visible");
		 System.out.println("Searched Products' heading is  visible");
		Thread.sleep(2000);
		
		home.sendproductname("tshirt");
		System.out.println("Enter tshirt in serch text field ");
		Thread.sleep(2000);
		
		home.clickSearchbutton();
		System.out.println("Click search button icon");
		Thread.sleep(2000);

		Assert.assertTrue(home.isTshirtVisible(), "Tshirt is not displayed!");
		System.out.println("Tshirt is  displayed!");
	}

}
