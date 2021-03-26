package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uni.pl.fmi.models.OrderPageModel;

public class OrderData {
	
	OrderPageModel orderPageModel = new OrderPageModel();
	
	@Given("^Potrebitelqt natiska na formata  za pravene na poruchka$")
	public void openOrderForm() throws Throwable {
	    ((OrderPageModel) orderPageModel).navigateOrderPageScreen();
	}

	@Given("^Potrebitelqt vuvejda validen nachin na plashtane \"([^\"]*)\"$")
	public void validPaymentWay(String paymentMethod) throws Throwable {
	    ((OrderPageModel) orderPageModel).setPaymentMethod(paymentMethod);
	}

	@Given("^Natiska butona napravi poruchka$")
	public void clickOrderButton() throws Throwable {
	    ((OrderPageModel) orderPageModel).clickOrderButton();
	}

	@Then("^Vijda suobshtenie za uspeshno napravena poruchka$")
	public void messageForValidOrder() throws Throwable {
	    assertEquals("Neuspeshno napravena poruchka", orderPageModel.getOrderMessage());
	}


	@Given("^Potrebitelqt vuvejda nevaliden nachin na plashtane \"([^\"]*)\"$")
	public void invalidPaymentMethod(String deliveryMethod) throws Throwable {
		((OrderPageModel) orderPageModel).setPaymentMethod(deliveryMethod);
	}

	@Then("^Vijda suobshtenie za nevaliden nachin za plashtane$")
	public void messageForInvalidPaymentMethod() throws Throwable {
		 assertEquals("Neuspeshno napravena poruchka", orderPageModel.getOrderMessage());
	}

	@Given("^Potrebitelqt vuvejda validen nachin za dostavka \"([^\"]*)\"$")
	public void validDeliveryMethod(String deliveryMethod) throws Throwable {
		((OrderPageModel) orderPageModel).setDeliveryMethod(deliveryMethod);
	}
	
	
	@Then("^Vijda suobshtenie za nevaliden nachin za dostavka$")
	public void vijda_suobshtenie_za_nevaliden_nachin_za_dostavka() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("Neuspeshno napravena poruchka", orderPageModel.getOrderMessage());
	}
	

}
