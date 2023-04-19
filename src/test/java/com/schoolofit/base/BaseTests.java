package com.schoolofit.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    private WebDriver driver;

    //method return type
    public void setUp() {
        //where chromedriver is located
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        //instantiate our driver
        driver = new ChromeDriver();

        //my url that i want to visit
        driver.get("https://the-internet.herokuapp.com/");
        //
        System.out.println(driver.getTitle());
        driver.manage().window().fullscreen();

    }
    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}


//ACCESS MODIFIER
//OOP