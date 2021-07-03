package tests.LoginPozififNegatif;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class PofitifGiris extends TestBase {

    @Test
    public void test01(){
        //driver.get("http://qa-environment.koalaresorthotels.com");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("UserName")).sendKeys("manager");
        driver.findElement(By.id("Password")).sendKeys("Manager1!");
        driver.findElement(By.id("btnSubmit")).click();
        driver.getTitle();


//        String expected_title = "Admin - ListOfUsers";
//        String actual_title= driver.getTitle();
//        Assert.assertEquals(expected_title,actual_title);



    }
}
