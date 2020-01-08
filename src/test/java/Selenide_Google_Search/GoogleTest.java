package Selenide_Google_Search;

import org.junit.Test;

public class GoogleTest {
    @Test
    public void verifyFirstSearchResultFromGoogle() {
        GooglePage googlePage = new GooglePage();
        googlePage.openGoogle();
        googlePage.searchFor("Rotten Tomatoes API");
        SearchResultsPage results = new SearchResultsPage();
        results.checkResultsSizeIsAtLeast(1);
        results.checkResultstHasTest(0, "Welcome to the Rotten Tomatoes® Developer Network");
        results.checkFirstResultUrl(0, "https://developer.fandango.com");
    }

}
