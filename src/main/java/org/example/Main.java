package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {
    WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        driver = new EdgeDriver();
    }
    @Test(priority = 2)
    public void test1() {
        System.out.println("Test_1");
    }
    @Test(priority = 1,enabled = false)
    public void test2() {
        System.out.println("Test_2");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Test_2");
    }


        




}