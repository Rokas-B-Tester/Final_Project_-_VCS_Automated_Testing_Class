package lt.rokas.pom.pages.biofitus;

import lt.rokas.pom.pages.Common;
import lt.rokas.pom.pages.Locators;

public class BiofitusHomePage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickOnLogInButton() {
        Common.clickElement(Locators.Biofitus.HomePage.logInButton);
    }


    public static void inputUserName(String userEmail) {
        Common.sendKeysToElement(userEmail,Locators.Biofitus.LogInPage.emailInput);
    }

    public static void inputPassword(String userPassword) {
        Common.sendKeysToElement(userPassword,Locators.Biofitus.LogInPage.passwordInput);
    }

    public static void clickOnConfirmLogInButton() {
        Common.clickElement(Locators.Biofitus.LogInPage.submitLogInButton);
    }

    public static String readConfirmationMessageAfterSuccessfulLogin() {
        return Common.getElementText(Locators.Biofitus.PersonalInfoPage.headerTextAfterSuccessfulLogin);
    }

    public static String readConfirmationMessageAfterInvalidLogin() {
        return Common.getElementText(Locators.Biofitus.LogInPage.listUserNotFound);
    }

    public static void clickOnLogOutButton() {
        Common.clickElement(Locators.Biofitus.PersonalInfoPage.myLogOutButton);
    }

    public static String readTextOnLogInButtonAfterLogOut() {
        return Common.getElementText(Locators.Biofitus.LogInPage.submitLogInButton);
    }

    public static void inputSearchKeyWords(String searchKeyWord) {
        Common.sendKeysToElement(searchKeyWord,Locators.Biofitus.HomePage.searchBoxInput);
    }

    public static void clickOnSearchButton() {
        Common.clickElement(Locators.Biofitus.HomePage.startSearchButton);
    }

    public static String readProductSearchResultHeadingMessage() {
        return Common.getElementText(Locators.Biofitus.SearchResultPage.paragraphOfSearchResults);
    }

    public static void inputInvalidSearchKeyWords(String searchKeyWord) {
        Common.sendKeysToElement(searchKeyWord,Locators.Biofitus.HomePage.searchBoxInput);
    }

    public static String readSearchResultWarningMessage() {
        return Common.getElementText(Locators.Biofitus.SearchResultPage.nothingFoundInSearchWarning);
    }

    public static String readEmptySearchWarningMessage() {
        return Common.getElementText(Locators.Biofitus.SearchResultPage.emptySearchInputWarning);
    }

    public static void clickOnNinthProductFromMainPage() {
        Common.clickElement(Locators.Biofitus.HomePage.homePageNinthDefaultProduct);
    }

    public static void clickOnAddProductToWishList() {
        Common.clickElement(Locators.Biofitus.ProductPage.buttonAddToWishList);
    }

    public static String readMessageFromAPopUpModal() {

        Common.waitForElementWithVisibilityChange(Locators.Biofitus.ProductPage.popUpMessageInModalWindow);

        return Common.getElementText(Locators.Biofitus.ProductPage.popUpMessageInModalWindow);
    }

    public static void clickOnHomePageIcon() {
        Common.clickElement(Locators.Biofitus.PersonalInfoPage.homePageLogo);
    }

    public static void clickOnSixthProductFromMainPage() {
        Common.clickElement(Locators.Biofitus.HomePage.homePageSixthDefaultProduct);
    }

    public static void closePopUpModalWindow() {

        Common.waitForElementWithVisibilityChange(Locators.Biofitus.ProductPage.popUpMessageInModalWindow);

        Common.pressEscKeyByAction(Locators.Biofitus.ProductPage.popUpMessageInModalWindow);
    }

    public static String readQuantityOfWishList() {

        Common.waitForElementWithVisibilityChange(Locators.Biofitus.ProductPage.quantityInWishlist);

        return Common.getElementText(Locators.Biofitus.ProductPage.quantityInWishlist);
    }

    public static void clickOnTenthProductFromMainPage() {
        Common.clickElement(Locators.Biofitus.HomePage.homePageTenthDefaultProduct);
    }

    public static void clickOnIncreaseProductCountByOne() {
        Common.clickElement(Locators.Biofitus.ProductPage.increaseQuantityByOneButton);
    }

    public static void clickOnAddToCartButton() {
        Common.clickElement(Locators.Biofitus.ProductPage.addToCartButton);
    }

    public static String readProductsAddedToCartModalWindow() {

        Common.waitForElementWithVisibilityChange(Locators.Biofitus.ProductPage.successfulAddToCartModalWindowMessage);

        return Common.getElementText(Locators.Biofitus.ProductPage.successfulAddToCartModalWindowMessage);
    }
}
