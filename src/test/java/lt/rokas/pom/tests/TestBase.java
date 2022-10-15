package lt.rokas.pom.tests;

import lt.rokas.pom.pages.Common;
import lt.rokas.pom.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeMethod
    public void setUp(){
        Common.setUpDriver();
    }

    @AfterMethod
    public void tearDown(){
        Common.closeDriver();

    }

}
