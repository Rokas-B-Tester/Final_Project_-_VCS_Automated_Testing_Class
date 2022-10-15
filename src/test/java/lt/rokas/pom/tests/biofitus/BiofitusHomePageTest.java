package lt.rokas.pom.tests.biofitus;

import lt.rokas.pom.pages.biofitus.BiofitusHomePage;
import lt.rokas.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

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
}
