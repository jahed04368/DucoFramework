package Utilities;

import DriverManager.DriverManager;
import Locators.Locators;
import Locators.LocatorsUtility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DriverManager.DriverManagerFactory;
import DriverManager.DriverType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class basePage {

    public static DriverManager driverManager;
    public static WebDriver driver;

    public void openGoogleBrowser()
    {

        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get("https://www.google.com/");


    }
    public void userSearches(){
        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.googleLogo)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.searchBar)).sendKeys("Duco");
        driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.googleSearchbutton)).click();

    }
    public void assertsLogo(){
        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.googleLogo)), 120);

        if( driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.googleLogo)).isDisplayed()){
            System.out.println("Google Logo is Visible");
        }else{
            System.out.println("Google Logo is InVisible");
        }
        Assert.assertTrue("Google Logo not found!", driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.googleLogo)).isDisplayed());

    }
    public void searchLink(){

        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.dukoSearch)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.dukoSearch)).click();

    }
    public void dukoPage (){
        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.dukoHomepage.careersPage)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.dukoHomepage.careersPage)).click();
        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.dukoHomepage.ourVacancies)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.dukoHomepage.ourVacancies)).click();
        if( driver.findElement(LocatorsUtility.getBy(Locators.dukoHomepage.qaRole)).isDisplayed()){
            System.out.println("Career page is displayed");
        }else{
            System.out.println("Career page is InVisible");
        }
    }
    public void feelingLucky (){
        waitFunction.waitForElementTobeVisibile(driver, driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.feelingLucky)), 12);
        driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.feelingLucky)).click();
        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.feelingLuckyAbout)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.feelingLuckyAbout)).click();


    }
    public void feelingLuckyAssert(){
        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.textAssert)), 120);

        String feelingLuckytext = driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.textAssert)).getText();
        System.out.println(feelingLuckytext);
        String actualFeelingLucytext = "Doodles are the fun, surprising and sometimes spontaneous changes that are made to the Google logo to celebrate holidays, anniversaries and the lives of famous artists, pioneers and scientists.";
        Assert.assertEquals(feelingLuckytext, actualFeelingLucytext);
    }
    public void deletesCookies (){
        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.googleSettings)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.googleSettings)).click();
        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.history)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.history)).click();

        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.headerClass)), 120);
        String headerText = driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.headerClass)).getText();
        System.out.println(headerText);
        String actualHeadertext = "Control how past searches can improve your search experience";
        headerText.replace(" ","");
        Assert.assertEquals(headerText, actualHeadertext);

        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.bodyText)), 120);
        String bodyText = driver.findElement(LocatorsUtility.getBy(Locators.googleHomepage.bodyText)).getText();
        System.out.println(bodyText);
        bodyText.replace(" ","");
        String actualBodyText = "Your searches on google.com from this browser are being used to help Google offer more relevant results and recommendations.";
        Assert.assertEquals(bodyText, actualBodyText);

    }
}
