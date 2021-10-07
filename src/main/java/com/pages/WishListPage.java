package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListPage {
	private WebDriver driver;
	
	private By wishlisticon = By.xpath("//span[text()='Add to wishlist']");
	private By wishList = By.xpath("(//a[@title='Wishlist'])[2]");
	private By productList= By.xpath("//div[@class='product-name']//a");
	
	public WishListPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addProduct()
	{
		List<WebElement> ProductList = driver.findElements(wishlisticon);
		int s=ProductList.size();
		System.out.println(s);
		for(int i=0;i<5;i++)
		{
			ProductList.get(i).click();
		}
	}
	
	public void clickWishList()
	{
		driver.findElement(wishList).click();
	}
	public List<String>  getProductList()
	{
		List<String> accountsList = new ArrayList<>();
		List<WebElement> ProductTableList = driver.findElements(productList);
		for (WebElement e : ProductTableList) {
			String text = e.getText();
			System.out.println(text);
			accountsList.add(text);
		}

		return accountsList;
	}
	

}
