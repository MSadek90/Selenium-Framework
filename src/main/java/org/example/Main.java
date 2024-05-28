package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {
    WebDriver driver;
    @BeforeTest(groups = {"regression"})
    public void openBrowser() {
        driver = new EdgeDriver();
    }
    @Test(groups = {"regression"})
    public void test01() {
        System.out.println("regression group");
    }
    @Test(groups = {"regression"})
    public void test02() {
        System.out.println("regression group");
    }
    @Test(groups = {"confirmation"})
    public void test03() {
        System.out.println("confirmation group");
    }
    @Test(groups = {"confirmation"})
    public void test04() {
        System.out.println("confirmation group");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Test_3");
    }


        




}