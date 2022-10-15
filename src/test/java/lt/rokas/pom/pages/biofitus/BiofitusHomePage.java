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
}
