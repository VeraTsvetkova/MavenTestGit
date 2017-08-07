package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import test2.EvroinsFront;


/**
 * Created by zhivkokasabov on 6/5/2017.
 */
public class GivenSteps {

    private EvroinsFront EvroinsFront;





    @Given("I am  on  Home Page<frontUrl>")
    public void whenIamOnMagAdminOrderPddage(@Named("frontUrl") String frontUrl)  {

        EvroinsFront = new EvroinsFront(frontUrl);}


    @Given("I am  on  Generate EGN Page")
    public void whenIamOnMagAdminOrderP2ddage()  {

        EvroinsFront.openEgnPage();}




    @When("I click on Vhod")

    public void whenIFillMagUsernameAndPasswordAndClickLoginBtn() {

        EvroinsFront.loginBtn();
    }

    @When("I fill my  <username>, <password> and I click the submit btn")

    public void whenIFillMagMobileUsernameAndPasswordAndClickLoginBtn(@Named("username") String username, @Named("password") String password) {

        EvroinsFront.makeLogin(username, password);
    }

    @When("I click Polici")

    public void whenIClickOnPolici() {

        EvroinsFront.policiMenu();
    }

    @When("I click Kasko")

    public void whenIClickKasko() {

        EvroinsFront.kaskoMenu();
    }

    @When("I click Nova Oferta")

    public void whenIClickNovaOfeta() {

        EvroinsFront.novaOferta();
    }


    @When("I click on Dobaviane na Slujitel")

    public void whenIClickDobavianeSlujiteli() {

        EvroinsFront.dobavianeSlujitel();
    }

    @When("I click on Dobaviane na Posrednik")

    public void whenIClickDobavianePosrednik() {

        EvroinsFront.dobavianePosrednik();
    }

    @When("I fill Slujitel ili Posrednik data <address>, <lk>, <date_lk>, <info> and I click SAVE btn")

    public void whenIFillDataClickLoginBtn( @Named("address") String address, @Named("lk") String lk, @Named("date_lk") String date_lk, @Named("info") String info) {

        EvroinsFront.vavediDanniSlujitelIPosrednik(address, lk, date_lk, info);
    }

    @When("I Get Egn")

    public void when1IClickDobavianeSlujiteli() {

        EvroinsFront.getEgnUnique();
    }




}
