package steps_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import page.HomePage;

public class HomePage_steps  {

    HomePage home = new HomePage();

    @Given("que eu pesquisar por {string}")
    public void que_eu_pesquisar_por(String string) {
        System.out.println("Buscando por " +string);
        assertTrue("true", home.digitaBusca(string));
    }

    @When("eu clico sobre a  {string}")
    public void eu_clico_sobre_a(String string) {

        assertTrue("true",  home.seleciona(string));
    }

    @Then("eu verei o {string}")
    public void eu_verei_o(String string) {

        assertTrue("true" , home.Assercao(string));
    }



}
