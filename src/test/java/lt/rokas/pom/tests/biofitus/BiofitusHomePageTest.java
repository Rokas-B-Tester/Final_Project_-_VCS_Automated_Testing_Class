package lt.rokas.pom.tests.biofitus;

import lt.rokas.pom.pages.biofitus.BiofitusHomePage;
import lt.rokas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BiofitusHomePageTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        BiofitusHomePage.open("https://biofitus.lt/");
    }

    @DataProvider(name = "logInWithValidData")
    public Object[][] logInWithValidDataProvider() {
        return new Object[][]{
                {"kagofoy553@inkmoto.com", "XcT)6weLK8d3Gg$v"},
        };

    }

    @Test(dataProvider = "logInWithValidData")
    private void testLoginWithValidData(String userEmail, String userPassword) {
        String expectedMessage = "Jūsų paskyra";
        String actualMessage = "";

        BiofitusHomePage.clickOnLogInButton();
        BiofitusHomePage.inputUserName(userEmail);
        BiofitusHomePage.inputPassword(userPassword);
        BiofitusHomePage.clickOnConfirmLogInButton();

        actualMessage = BiofitusHomePage.readConfirmationMessageAfterSuccessfulLogin();

        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test
    private void testLoginWithInvalidData() {
        String userEmail = "abcd@efg.com";
        String userPassword = "6an2LeZ(m*4j8C5B";
        String expectedMessage = "Neteisingi prisijungimo duomenys arba tokiu el. paštu registruotos paskyros nėra.";
        String actualMessage = "";

        BiofitusHomePage.clickOnLogInButton();
        BiofitusHomePage.inputUserName(userEmail);
        BiofitusHomePage.inputPassword(userPassword);
        BiofitusHomePage.clickOnConfirmLogInButton();

        actualMessage = BiofitusHomePage.readConfirmationMessageAfterInvalidLogin();

        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test(dataProvider = "logInWithValidData")
    private void testLogOutFromAccount(String userEmail, String userPassword) {

        String expectedLogInMessage = "Jūsų paskyra";
        String actualLogInMessage = "";
        String expectedLogOutMessage = "PRISIJUNGTI";
        String actualLogOutMessage = "";

        BiofitusHomePage.clickOnLogInButton();
        BiofitusHomePage.inputUserName(userEmail);
        BiofitusHomePage.inputPassword(userPassword);
        BiofitusHomePage.clickOnConfirmLogInButton();
        actualLogInMessage = BiofitusHomePage.readConfirmationMessageAfterSuccessfulLogin();

        Assert.assertEquals(actualLogInMessage, expectedLogInMessage);

        BiofitusHomePage.clickOnLogOutButton();
        actualLogOutMessage = BiofitusHomePage.readTextOnLogInButtonAfterLogOut();

        Assert.assertEquals(actualLogOutMessage, expectedLogOutMessage);

    }

    @DataProvider(name = "searchWithValidData", parallel = true)
    public Object[][] validSearchKeywordsDataProvider() {
        return new Object[][]{
                {"Kalis"},
                {"Magnis"},
                {"Cinkas"},
                {"Selenas"},
                {"Kolagenas"}
        };
    }

    @Test(dataProvider = "searchWithValidData", threadPoolSize = 5)
    private void testSearchWithValidData(String searchKeyWord) {
        String expectedMessage = "Rasta";
        String actualMessage = "";

        BiofitusHomePage.inputSearchKeyWords(searchKeyWord);
        BiofitusHomePage.clickOnSearchButton();
        actualMessage = BiofitusHomePage.readProductSearchResultHeadingMessage();

        Assert.assertTrue(
                actualMessage.contains(expectedMessage),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualMessage,
                        expectedMessage
                )
        );
    }

    @DataProvider(name = "searchWithInvalidData", parallel = true)
    public Object[][] invalidSearchKeywordsDataProvider() {
        return new Object[][]{
                {"Kotletas"},
                {"abcdef"},
                {"147852"},
                {"Batonas"},
                {"morka"}
        };
    }

    @Test(dataProvider = "searchWithInvalidData", threadPoolSize = 5)
    private void testSearchWithInvalidData(String searchKeyWord) {
        String expectedMessage = "Rezultatų nerasta.";
        String actualMessage = "";

        BiofitusHomePage.inputInvalidSearchKeyWords(searchKeyWord);
        BiofitusHomePage.clickOnSearchButton();
        actualMessage = BiofitusHomePage.readSearchResultWarningMessage();

        Assert.assertTrue(
                actualMessage.contains(expectedMessage),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualMessage,
                        expectedMessage
                )
        );
    }

    @Test
    private void testSearchWithEmptyInput() {
        String expectedMessage = "Įveskite paieškos žodį.";
        String actualMessage = "";

        BiofitusHomePage.clickOnSearchButton();
        actualMessage = BiofitusHomePage.readEmptySearchWarningMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    private void testAddingProductToWishListWithOutLoggingIn() {
        String expectedMessage = "You must be logged in to manage your wishlist";
        String actualMessage = "";

        BiofitusHomePage.clickOnNinthProductFromMainPage();
        BiofitusHomePage.clickOnAddProductToWishList();
        actualMessage = BiofitusHomePage.readMessageFromAPopUpModal();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(dataProvider = "logInWithValidData")
    private void testAddingProductToWishListWhileLoggedIn(String userEmail, String userPassword) {
        String expectedMessage = "1";
        String actualMessage = "";

        BiofitusHomePage.clickOnLogInButton();
        BiofitusHomePage.inputUserName(userEmail);
        BiofitusHomePage.inputPassword(userPassword);
        BiofitusHomePage.clickOnConfirmLogInButton();
        BiofitusHomePage.clickOnHomePageIcon();
        BiofitusHomePage.clickOnSixthProductFromMainPage();
        BiofitusHomePage.clickOnAddProductToWishList();
        BiofitusHomePage.closePopUpModalWindow();
        actualMessage = BiofitusHomePage.readQuantityOfWishList();
        BiofitusHomePage.clickOnAddProductToWishList();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    private void testAddProductToCart(){
        String expectedMessage = "Prekė sėkmingai pridėta į krepšelį";
        String actualMessage = "";

        BiofitusHomePage.clickOnTenthProductFromMainPage();
        BiofitusHomePage.clickOnIncreaseProductCountByOne();
        BiofitusHomePage.clickOnAddToCartButton();
        actualMessage = BiofitusHomePage.readProductsAddedToCartModalWindow();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

}

