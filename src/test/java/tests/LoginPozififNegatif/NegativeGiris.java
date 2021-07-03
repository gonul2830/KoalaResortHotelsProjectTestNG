package tests.LoginPozififNegatif;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.TestBase;

public class NegativeGiris extends TestBase {



    @Test
    public void test01(){
        //driver.get("http://qa-environment.koalaresorthotels.com");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("UserName")).sendKeys("GONUL1");
        driver.findElement(By.id("Password")).sendKeys("Manager1!");
        driver.findElement(By.id("btnSubmit")).click();
        Assert.assertTrue(driver.findElement(By.id("divMessageResult")).isDisplayed());

    }

    @Test
    public void test02(){
        //driver.get("http://qa-environment.koalaresorthotels.com");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("UserName")).sendKeys("manager");
        driver.findElement(By.id("Password")).sendKeys("GONUL");
        driver.findElement(By.id("btnSubmit")).click();
        Assert.assertTrue(driver.findElement(By.id("divMessageResult")).isDisplayed());
    }

    @Test
    public void test03(){
        //driver.get("http://qa-environment.koalaresorthotels.com");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("UserName")).sendKeys("GONUL1");
        driver.findElement(By.id("Password")).sendKeys("GONUL");
        driver.findElement(By.id("btnSubmit")).click();
        Assert.assertTrue(driver.findElement(By.id("divMessageResult")).isDisplayed());
    }
}
