package uni.pl.fmi.models;

import uni.pl.fmi.services.BookService;
import uni.pl.fmi.services.OrderService;

public class BookPageModel {

	private String bookTitle;
	private String message;

	public void navigateSearchBookScreen() {
		System.out.println("Navigirano e do stranicata za tursene na kniga");
		
	}

	public void setTitle(String bookTitle) {
		this.bookTitle = bookTitle;
		
	}
	
public void clickSearchButton() {
		
		message = BookService.search(bookTitle);
	}
	

	public String getSearchMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

}
