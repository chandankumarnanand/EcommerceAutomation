package PomRepogetry;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		}

     @FindBy(xpath="//a[text()=' Products']")
   private WebElement  Product_button;

    @FindBy(id="search_product") 
    private WebElement  Search_textfield;
     
     @FindBy(id="submit_search")
     private WebElement Search_button;
     
    @FindBy(xpath="//u[text()='View Cart']")
    private  WebElement  ViewCart_button;
    
     @FindBy(xpath = "//p[contains(text(),'Green Side Placket Detail T-Shirt')]")
     private  WebElement tshirt_Text;

    @FindBy(xpath="//a[@class='btn btn-default add-to-cart']")
    private List<WebElement> addToCartButtons;
    
    @FindBy(className= "cart_price")
    private WebElement priceText;

    @FindBy( className= "cart_description")
    private WebElement productNameText;
    
    @FindBy(xpath = "//h2[text()='All Products']")
    private WebElement searchedProductsHeading;

    public boolean isSearchedProductsHeadingVisible() {
        return searchedProductsHeading.isDisplayed();
    }
    public boolean isPriceVisible() {
    	System.out.println("product price is " +priceText.getText() );
        return priceText.isDisplayed();
    }

    public boolean isProductNameVisible() {
    	System.out.println("product name is " +productNameText.getText());
        return productNameText.isDisplayed();
    }
	public WebElement getTshirt_Text() {
		return tshirt_Text;
	}



	



	public WebElement getProduct_button() {
		return Product_button;
	}

	
	
	public WebElement getSearch_textfield() {
		return Search_textfield;
	}



	public void clickproduct() {
		Product_button.click();
	}
     
    public void sendproductname(String tshirt) {
    	Search_textfield.sendKeys(tshirt);
    }
    
    public void clickSearchbutton() {
    	Search_button.click();
    }



	public WebElement getSerch_button() {
		return Search_button;
	}


	 public boolean isTshirtVisible() {
         return tshirt_Text.isDisplayed();
        
     }
	 
	 
	 public void clickFirstAddToCartButton() {
		    addToCartButtons.get(0).click();  // clicks the first button
		}







	public List<WebElement> getAddToCartButtons() {
		return addToCartButtons;
	}






public void clickviewcart() {
	ViewCart_button.click();
}
	







	public WebElement getViewCart_button() {
	return ViewCart_button;
}

	public WebElement getSearch_button() {
		return Search_button;
	}
	
}
     
     

