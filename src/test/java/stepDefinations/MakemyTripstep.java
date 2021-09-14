package stepDefinations;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModal.MakeMytPOM;
import utilPackage.CommonClass;

public class MakemyTripstep extends CommonClass {
	MakeMytPOM mp;

	@Given("launch the makemytrip website")
	public void launch_the_makemytrip_website() {
		CommonClass.inititalizebrowser();

	}

	@Given("User click on pop-up")
	public void update_the_trip_type_to_round_trip() {
		mp = new MakeMytPOM(driver);
		mp.normalClick();
	}

	@When("User select the cities in {string} and {string} field")
	public void user_select_the_cities_in_from_and_to_field(String From, String To) throws InterruptedException {
		mp.clickFromCity(From);
		mp.clickToCity(To);
	}

	@When("select the Departure and Return date along with Travel&class and click on Search button")
	public void select_the_departure_and_return_date_along_with_travel_class_and_click_on_search_button() {

		// mp.clickOnDeparture();

		mp.clickDepartureDate();
		mp.clickOnReturn();
		mp.clickReturnDate();
		mp.clickOnTravelClass();
		mp.selectAdults();
		mp.selectChilder();
		mp.selectInfants();
		mp.selectBussinessClass();
		mp.clickOnApplybtton();
		mp.clickOnSearchButton();
	}

	@Then("User should be in flght detail screen")
	public void user_should_be_in_flght_detail_screen() {
		String st = driver.getPageSource();
		if (st.contains("Flights from Bengaluru to Hyderabad, and back")) {
			System.out.println("move to next element");
		}

	}

	@When("User selects Air india and Vistara flights in popular filter")
	public void user_selects_air_india_and_vistara_flights_in_popular_filter() throws InterruptedException {
		// mp.clickonShowmore();
		mp.selectAirIndiafilter();
		Thread.sleep(2000);
		mp.selectVistrafilter();
	}

	@When("User scroll down")
	public void user_scroll_down() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,900)");

	}

	@When("User scrolll down")
	public void user_scrolll_down() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1400)");

	}

	@When("select Onward flight as Air India and Return as Vistara")
	public void select_onward_flight_as_air_india_and_return_as_vistara() {
		mp.clickAirIndiaonwards();

	}

	@When("select Onward flight as Air India and Return as Vistaraa")
	public void select_onward_flight_as_air_india_and_return_as_vistaraa() throws InterruptedException {
		Thread.sleep(2000);
		mp.clickVistaraReturn();

	}

	@When("click on Book button")
	public void click_on_book_button() {
		mp.clickOnbooknow();

	}

	@Then("User should be prompted with a pop-up")
	public void user_should_be_prompted_with_a_pop_up() {
		String se = driver.getPageSource();
		if (se.contains("You have more fares to select from")) {
			System.out.println("Move to next element");
		} else {
			System.out.println("Stay at same line");
		}
	}

	@Then("click on Continue button")
	public void click_on_continue_button() {
		mp.clickOnContinue();
	}

	@Then("user shoule navigate to complete your booking screen")
	public void user_shoule_navigate_to_complete_your_booking_screen() {
		String se = driver.getPageSource();
		if (se.contains("Complete your booking")) {
			System.out.println("Move to next element");
		} else {
			System.out.println("Stay at same line");
		}

	}

	@Then("print the fair details")
	public void print_the_fail_details() {
		CommonClass.switchTochild();

	}

	@Then("print the summary fair details")
	public void print_the_summary_fair_details() {
		mp.getfair();

	}

	@Then("quite the browser")
	public void close_the_browser() {
		CommonClass.closeBrowser();
	}

}
