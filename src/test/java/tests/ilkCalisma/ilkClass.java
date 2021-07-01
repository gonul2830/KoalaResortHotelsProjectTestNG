package tests.ilkCalisma;

import org.junit.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class ilkClass {

@Test
    public void test01(){

    Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
}
}
