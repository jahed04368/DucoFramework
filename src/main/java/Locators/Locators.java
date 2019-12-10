package Locators;

public class Locators {

    //feedback from Hudl
    //do not use 'interface' here, use class
    public static class googleHomepage
    {
        public static String googleLogo = "id=hplogo";
        public static String searchBar = "name=q";
        public static String googleSearchbutton = "name=btnK";
        public static String dukoSearch = "xpath=//cite[@class=\"iUh30\"]";
        public static String feelingLucky = "xpath=//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]";
        public static String feelingLuckyAbout = "xpath=//*[@href=\"/doodles/about\"]";
        public static String textAssert = "xpath=//*[@id=\"about-intro\"]";
        public static String googleSettings = "id=fsettl";
        public static String history = "xpath=//*[contains(text(), 'History')]";
        public static String headerClass = "xpath=//*[@class=\"md-title\"]";
        public static String bodyText = "xpath=//*[@class=\"cb-main-text\"]";


    }
    public static class dukoHomepage
    {
        public static String careersPage = "id=menu-item-27";
        public static String ourVacancies = "xpath=//a[@href=\"#current-vacancies\"]";
        public static String qaRole = "xpath=//*[@href=\"https://jobs.lever.co/duco/e71ffa63-3806-40b7-8ebb-9191b597cc36\"]";


    }

}

