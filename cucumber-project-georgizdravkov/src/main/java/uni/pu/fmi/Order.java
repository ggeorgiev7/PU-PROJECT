package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class Order {

	private String id;
    private double price;
    private String status;
    private String paymentMethod;
    private String deliveryMethod;
    
    
    public Order() {
    }

    /**
     * 
     */
    

    /**
     * 
     */
    
    public Set<User> orders;
    
    public Set<Book> books;
    
    

   
    public String getID() {
        // TODO implement here
        return id;
    }

    public void setID(String id) {
        // TODO implement here
        this.id = id;
    }


    public double getPrice() {
        // TODO implement here
        return price;
    }


    public void setPrice(double price) {
        // TODO implement here
        this.price = price;
    }

  
    public String getStatus() {
        // TODO implement here
        return status;
    }


    public void setStatus(String status) {
        // TODO implement here
        this.status = status;
    }

    public String getPaymentMethod() {
        // TODO implement here
        return paymentMethod;
    }


    public void setPaymentMethod(String paymentMethod) {
        // TODO implement here
        this.paymentMethod = paymentMethod;
    }


    public String getDeliveryMethod() {
        // TODO implement here
        return deliveryMethod;
    }

    
    public void setDeliveryMethod(String deliveryMethod) {
        // TODO implement here
        this.deliveryMethod = deliveryMethod;
    }

}