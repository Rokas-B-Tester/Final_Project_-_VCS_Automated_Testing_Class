package lt.rokas.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Biofitus{

        public static class HomePage{
            public static By logInButton = By.xpath("//span[text()='Prisijungti']");
        }

        public static class LogInPage{

            public static By emailInput = By.xpath("//input[@placeholder='El.paštas']");

            public static By passwordInput = By.xpath("//input[@placeholder='Slaptažodis']");

            public static By submitLogInButton = By.xpath("//button[@id='submit-login']");

            public static By listUserNotFound = By.xpath("//li[@class='alert alert-danger']");

        }

        public static class PersonalInfoPage{

            public static By headerTextAfterSuccessfulLogin = By.xpath(
                    "//h1[contains(text(),'Jūsų paskyra')]"
            );

            public static By myLogOutButton = By.xpath("//a[@class='btn btn-outline btn-tertiary']");
        }

    }

}
