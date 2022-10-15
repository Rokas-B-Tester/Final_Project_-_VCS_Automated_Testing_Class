package lt.rokas.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Biofitus{

        public static class HomePage{
            public static By logInButton = By.xpath("//span[text()='Prisijungti']");

            public static By searchBoxInput = By.xpath("//input[@id='leo_search_query_top']");

            public static By startSearchButton = By.xpath("//button[@id='leo_search_top_button']");

            public static By homePageNinthDefaultProduct = By.xpath(
                    "(//a[contains(@class,'thumbnail product-thumbnail')])[9]"
            );

            public static By homePageSixthDefaultProduct = By.xpath(
                    "(//a[contains(@class,'thumbnail product-thumbnail')])[6]"
            );

            public static By homePageTenthDefaultProduct = By.xpath(
                    "(//a[contains(@class,'thumbnail product-thumbnail')])[10]"
            );
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

            public static By homePageLogo = By.xpath("//a[@class='logo']");
        }

        public static class SearchResultPage{

            public static By paragraphOfSearchResults = By.xpath(
                    "//p[@class='products-counter hidden-md-down']"
            );

            public static By nothingFoundInSearchWarning = By.xpath("//p[@class='alert alert-warning']");

            public static By emptySearchInputWarning = By.xpath("//*[@id='content-wrapper']/p");
        }

        public static class ProductPage{

            public static By buttonAddToWishList = By.xpath("//span[contains(text(),'Įsiminti prekę')]");

            public static By popUpMessageInModalWindow = By.xpath(
                    "//h5[@class='modal-title text-xs-center']"
            );

            public static By quantityInWishlist = By.xpath(
                    "(//span[@class='ap-total-wishlist ap-total'])[2]"
            );

            public static By increaseQuantityByOneButton = By.xpath(
                    "//i[@class='material-icons touchspin-up']"
            );

            public static By addToCartButton = By.xpath("//button[@class='btn btn-primary add-to-cart']");
            public static By successfulAddToCartModalWindowMessage = By.xpath("//h4[@id='myModalLabel']");
        }

    }

}
