package cucumberStepDefinitions;

import Model.TicketResponse;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import java.io.IOException;

public class TicketCheckStepDef {

    private TicketChecker ticketChecker = new TicketChecker();
    private TicketResponse ticketResponse = new TicketResponse();

    @When("we are requesting confirmation")
    public void get_ticket_confirmation() throws IOException {
        ticketResponse = ticketChecker.getTickets()
    }
    @Then("Name should be (.*)")
    public void check_name(String name) {
        Assert.assertEquals("Wrong name: ", name, ticketResponse.getName();
    }
    @Then("Surname should be (.*)")
    public void check_surname(String surname) {
        Assert.assertEquals("Wrong surname",surname,ticketResponse.getSurname());
    }
    @Then("From should be (.*)")
    public void check_from(String from) {
        Assert.assertEquals("Wrong departure", from,ticketResponse.getAfrom());
    }

    @Then("To should be (.*)")
    public void check_to(String to) {
        Assert.assertEquals("Wrong destination ", to, ticketResponse.getAto());
    }

    @Then("Baggage should (.*)")
    public void check_baggage(Integer baggage) {
        Assert.assertEquals("Wrong number of bags",baggage, ticketResponse.getBugs());
    }

    @Then("Discount code should be (.*)")
    public void check_discount(Integer discount) {
        Assert.assertEquals("Wrong discount code", discount, ticketResponse.getDiscount());
    }

    @Then("Number of children is (.*)")
    public void check_kids(Integer kids) {
        Assert.assertEquals("Wrong number of kids", kids, ticketResponse.getKids());
    }

    @Then("Number of adults should be (.*)")
    public void check_adults(Integer adults) {
        Assert.assertEquals("Wrong number of adults",adults,ticketResponse.getAdults());
    }

    @Then("Seat number is(.*)")
    public void check_seat(Integer seat) {
        Assert.assertEquals("Wrong seat number", seat,ticketResponse.getSeat());
    }
}
