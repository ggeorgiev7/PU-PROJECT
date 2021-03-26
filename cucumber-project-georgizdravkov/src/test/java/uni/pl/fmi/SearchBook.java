package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uni.pl.fmi.models.BookPageModel;

public class SearchBook {
	
	BookPageModel bookPageModel = new BookPageModel();
	
	@Given("^Potrebitelqt natiska na formata  za vuvejdane na ime na knigata$")
	public void searchBookForm() throws Throwable {
	    bookPageModel.navigateSearchBookScreen();
	}

	@Given("^Potrebitelqt vuvejda ime na knigata \"([^\"]*)\"$")
	public void fillBookTitle(String bookTitle) throws Throwable {
	    ((BookPageModel) bookPageModel).setTitle(bookTitle);
	}

	@Given("^Natiska butona za tursene$")
	public void clickSearchButton() throws Throwable {
	    bookPageModel.clickSearchButton();
	}

	@Then("^Vijda suobshtenie za namerena kniga$")
	public void showMessageForFoundBook() throws Throwable {
		 assertEquals("namerena kniga", bookPageModel.getSearchMessage());
	}

	@Then("^Vijda suobshtenie za ne namerena kniga$")
	public void showMessageForNotFoundBook() throws Throwable {
		assertEquals("ne namerena kniga", bookPageModel.getSearchMessage());
	}


}
