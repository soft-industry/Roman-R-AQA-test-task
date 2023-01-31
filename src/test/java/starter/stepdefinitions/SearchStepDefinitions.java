package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.helpers.SearchRequestsSteps;
import starter.helpers.SearchVerificationSteps;

public class SearchStepDefinitions {
    @Steps
    protected SearchRequestsSteps searchRequestsSteps;

    @Steps
    protected SearchVerificationSteps searchVerificationSteps;

    @When("user calls search endpoint for {string}")
    public void userCallsSearchEndpoint(String keyWord) {
        searchRequestsSteps.sendRequest(keyWord);
    }

    @Then("user sees search results for {string}")
    public void userSeesResultsForProduct(String keyWord) {
        searchVerificationSteps.responseContainsValues("title", keyWord);
    }

    @Then("user sees error")
    public void userSeesError() {
        searchVerificationSteps.responseDoesntContainResult();
    }
}
