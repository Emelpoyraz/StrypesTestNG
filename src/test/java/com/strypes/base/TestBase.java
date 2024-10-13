package com.strypes.base;

import com.strypes.utilities.ConfigurationReader;
import com.strypes.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBase {


    @BeforeMethod
    public void setUp(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url"));

    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
