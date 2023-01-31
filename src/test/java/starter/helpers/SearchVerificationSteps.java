package starter.helpers;

import net.thucydides.core.annotations.Step;
import starter.dto.SearchResultItem;

import java.util.stream.IntStream;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class SearchVerificationSteps {

    @Step("Check are all json nodes {0} contain String \"{1}\"")
    public void responseContainsValues(String jsonNode, String keyWord) {
        restAssuredThat(response -> {
            int length = response.extract().body().as(SearchResultItem[].class).length;

            IntStream.range(0, length)
                    .forEach(i -> {
                        String currentJsonNode = jsonNode + "[" + i + "]";
                        response.body(currentJsonNode, containsStringIgnoringCase(keyWord));
                    });
        });
    }

    @Step("Check is json displays error message")
    public void responseDoesntContainResult() {
        restAssuredThat(response ->
                response
                        .statusCode(404)
                        .body("detail.error", equalTo(Boolean.TRUE)));
    }
}
