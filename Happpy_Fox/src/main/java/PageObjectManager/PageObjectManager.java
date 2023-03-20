package PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.happyfox.Baseclass.Baseclass;
import com.happyfox.Locators.HomePage;
import com.happyfox.Locators.LoginPage;
import com.happyfox.Locators.PriorityPage;
import com.happyfox.Locators.Statuspage;
import com.happyfox.Locators.TicketCreation;

public class PageObjectManager extends Baseclass{

public PageObjectManager(WebDriver xdriver) {
this.driver=xdriver;
}

private LoginPage LoginPage;

public LoginPage getLoginPage() {
	if (LoginPage==null) {
		LoginPage=new LoginPage(driver);
	}
	return LoginPage;
}

private HomePage HomePage;

public HomePage getHomePage() {
	if (HomePage==null) {
		HomePage=new HomePage(driver);
	}
	return HomePage;
}

private Statuspage SPpage;

public Statuspage getSPpage() {
	if(SPpage==null) {
		SPpage= new Statuspage(driver);
	}
	return SPpage;
}

private PriorityPage PriorityPage;

public PriorityPage getPriorityPage() {
	if (PriorityPage==null) {
		PriorityPage=new PriorityPage(driver);
	}
	return PriorityPage;
}

private TicketCreation TicketCreation;

public TicketCreation getTicketCreation() {
	if (TicketCreation==null) {
		TicketCreation=new TicketCreation(driver);
	}
	return TicketCreation;
}






	

}
