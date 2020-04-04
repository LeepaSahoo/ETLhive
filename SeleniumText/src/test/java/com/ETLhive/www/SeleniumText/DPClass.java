package com.ETLhive.www.SeleniumText;

import org.testng.annotations.DataProvider;

public class DPClass {
@DataProvider(name="testData")
public static Object[][] getDatafromhere(){
		return new Object[][]{
				{"http://the-internet.herokuapp.com/iframe","iframe test"},
				{"http://the-internet.herokuapp.com/iframe","test data test test"}
				};
}
}
