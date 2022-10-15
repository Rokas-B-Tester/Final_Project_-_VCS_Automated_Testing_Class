package lt.rokas.pom.pages;

import lt.rokas.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Common {

    public static void setUpDriver() {
        Driver.setDriver();

    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);

    }

    public static void closeDriver() {
        Driver.close();

    }

    public static WebElement getElement(By locator){
        return Driver.getDriver().findElement(locator);

    }

    public static void sendKeysToElement(String keys, By locator) {
        getElement(locator).sendKeys(keys);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void waitForElementWithVisibilityChange(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void pressEscKeyByAction(By locator) {
        WebElement element = getElement(locator);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.sendKeys(Keys.ESCAPE);
        action.perform();
    }

}
