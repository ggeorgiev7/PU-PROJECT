package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.Book;

public class BookService {

	public static String search(String bookTitle) {
		
		if(bookTitle == null) {
			return "ne namerena kniga";
		}
		
		
		List<Book> books = getBooks();
		final boolean isBookMatched = books.stream().anyMatch(book -> bookTitle.equals(book.getTitle()));
		
		if(isBookMatched == true) {
			return "namerena kniga";
		}
		
		else {
			return "ne namerena kniga";
		}
	}
	
	private static List<Book> getBooks(){
     Book book = new Book();
     book.setTitle("Pod Igoto");
     final List<Book> result = new ArrayList<Book>();
     result.add(book);
     return result;
}
}
