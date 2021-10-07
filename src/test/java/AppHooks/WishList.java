package AppHooks;

import java.util.List;

import com.pages.AccountsPage;
import com.pages.WishListPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishList {
	private WishListPage wishListPage;
	
	@Given("I add four different products to my wish list")
	public void i_add_four_different_products_to_my_wish_list() {
		DriverFactory.getDriver()
		.get("https://testscriptdemo.com/");  
	}

	@When("I view my wishlist table")
	public void i_view_my_wishlist_table() {
		wishListPage.clickWishList();
	}

	@Then("I find total four selected item in my Wishlist")
	public void i_find_total_four_selected_item_in_my_wishlist() {
		List<String> actualProductList = wishListPage.getProductList();
		System.out.println("Actual accounts section list: " + actualProductList);
	   
	}

	
}
