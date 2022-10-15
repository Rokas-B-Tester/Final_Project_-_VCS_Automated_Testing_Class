package lt.rokas.pom.pages;

import lt.rokas.pom.utils.Driver;

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

}
