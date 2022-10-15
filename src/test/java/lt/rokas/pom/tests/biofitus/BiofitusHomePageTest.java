package lt.rokas.pom.tests.biofitus;

import lt.rokas.pom.pages.biofitus.BiofitusHomePage;
import lt.rokas.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;

public class BiofitusHomePageTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        BiofitusHomePage.open("https://biofitus.lt/");
    }
}
