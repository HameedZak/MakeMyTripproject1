Feature: Book a Flight ticket for different cities on Makemytrip 
Scenario Outline: 
	Verify the process of booking a flight in Makemytrip for Bangalore to Dehli and Mumbai
	Given launch the makemytrip website 
	And User click on pop-up 
	When User select the cities in "<From>" and "<To>" field 
	And select the Departure and Return date along with Travel&class and click on Search button 
	Then User should be in flght detail screen 
	When User selects Air india and Vistara flights in popular filter 
	And User scroll down 
	And select Onward flight as Air India and Return as Vistara 
	And click on Book button 
	Then User should be prompted with a pop-up 
	And click on Continue button 
	And user shoule navigate to complete your booking screen 
	And print the fair details 
	And quite the browser 
	
	Examples: 
		|From||To|
		|Bangalore||Delhi|
		|Bangalore||Mumbai|
		
		
		
		Scenario Outline: 
	Verify the process of booking a flight in Makemytrip for Bangalore to Kolkata and Hyderabad
	Given launch the makemytrip website 
	And User click on pop-up 
	When User select the cities in "<From>" and "<To>" field 
	And select the Departure and Return date along with Travel&class and click on Search button 
	Then User should be in flght detail screen 
	When User selects Air india and Vistara flights in popular filter 
	And User scrolll down 
	And select Onward flight as Air India and Return as Vistaraa 
	And click on Book button 
	Then User should be prompted with a pop-up 
	And click on Continue button 
	And user shoule navigate to complete your booking screen 
	And print the summary fair details 
	And quite the browser 
	
	Examples: 
		|From||To|
		|Bangalore||Kolkata|
		|Bangalore||Hyderabad|
