package tests.ilkCalisma;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class ilkClass {

    // mesut branch


@Test
    public void test01(){

    Driver.getDriver().get(ConfigReader.getProperty("kr_url"));

    Driver.closeDriver();

}
}
