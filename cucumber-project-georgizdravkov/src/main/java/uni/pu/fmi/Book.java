package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class Book {

	private String title;
	private String author;
	private double price;
	private String id;
	private int count;

    public Book() {
    }
    
    
    public Set<Order> orders;

    /**
     * @return
     */
    public String getTitle() {
        // TODO implement here
        return title;
    }

    /**
     * @param title 
     * @return
     */
    public void setTitle(String title) {
         this.title = title;
    }

    public String getAuthor() {
        // TODO implement here
        return author;
    }

    public  void setAuthor(String author) {
        // TODO implement here
       this.author = author;
    }

    /**
     * @return
     */
    public double getPrice() {
        // TODO implement here
        return price;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(double price) {
        // TODO implement here
        this.price = price;
    }

    /**
     * @return
     */
    public String getID() {
        // TODO implement here
        return id;
    }

    /**
     * @param id 
     * @return
     */
    public void setID(String id) {
        // TODO implement here
        this.id = id;
    }

    /**
     * @return
     */
    public int getCount() {
        // TODO implement here
        return count;
    }

    /**
     * @param count 
     * @return
     */
    public void setCount(int count) {
        // TODO implement here
        this.count = count;
    }

}