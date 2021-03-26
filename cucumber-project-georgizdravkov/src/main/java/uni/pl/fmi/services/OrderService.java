package uni.pl.fmi.services;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

import uni.pu.fmi.Book;
import uni.pu.fmi.Order;

public class OrderService {

	public static String order(String paymentMethod, String deliveryMethod) {
		
		if(paymentMethod == null || deliveryMethod == null) {
			return "Neuspeshno napravena poruchka";
		}
		
		ArrayList<Order> orders = getOrders();
		final boolean isOrderMatched = orders.stream().anyMatch(order -> order.equals(order.getDeliveryMethod())
				&& order.getPaymentMethod().equals(paymentMethod));
		
		return isOrderMatched? "Uspeshno napravena porachka" : "Neuspeshno napravena poruchka";
		
	}
	
	private static ArrayList<Order> getOrders(){
		Order order = new Order();
		order.setDeliveryMethod("Do adres");
		order.setPaymentMethod("Nalojen platej");
		final ArrayList<Order> result = new ArrayList<Order>();
		result.add(order);
		return result;
	}

}
