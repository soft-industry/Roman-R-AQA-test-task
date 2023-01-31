package starter.helpers;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


public class SearchRequestsSteps {
    private final String SEARCH_ENDPOINT = "https://waarkoop-server.herokuapp.com/api/v1/search/test/";

    @Step("Send search request to endpoint {0}")
    public void sendRequest(String keyWord) {
        String fullEndpoint = SEARCH_ENDPOINT + keyWord;
        SerenityRest.given().get(fullEndpoint);
    }
}
