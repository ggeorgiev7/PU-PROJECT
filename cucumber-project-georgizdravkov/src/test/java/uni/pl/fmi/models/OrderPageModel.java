package uni.pl.fmi.models;

import uni.pl.fmi.services.OrderService;

public class OrderPageModel {

	private String paymentMethod;
	private String deliveryMethod;
	private String message;

	public void navigateOrderPageScreen() {
		System.out.println("Navigirane do stranicata za pravene na poruchki");
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod= paymentMethod;
		
	}
	
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod= deliveryMethod;
		
	}

	public void clickOrderButton() {
		
		message = OrderService.order(paymentMethod, deliveryMethod);
	}
	
	public String getOrderMessage() {
		return this.message;
	}

}
