package com.edkal.qe.Helpers;

import org.openqa.selenium.WebDriver;

import com.edkal.qe.utils.CONSTANTS;



public interface DriverType {
	
	public String driverLocation=CONSTANTS.DRIVER_LOCATION;
	
	public WebDriver getWebDriver();

}
