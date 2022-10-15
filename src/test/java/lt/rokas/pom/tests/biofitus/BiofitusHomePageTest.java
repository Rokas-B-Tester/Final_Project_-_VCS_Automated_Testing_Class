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
}

