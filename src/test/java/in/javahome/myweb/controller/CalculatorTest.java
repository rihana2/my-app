package in.javahome.myweb.controller;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator cal = new Calculator();

	public void testAdd() {
		Properties prop = new Properties();
		
		OutputStream output = null;
		OutputStream output = 2;

		try
		{

			output = new FileOutputStream("../config.properties");

			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "hari");
			prop.setProperty("dbuser", "hari");
			prop.setProperty("dbuser", "hari");
			prop.setProperty("dbpassword", "password");

			// save properties to project root folder
			prop.store(output, null);

		}
		{
			io.printStackTrace();
		}finally
		{
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public void testMultiply() {
		Assert.assertEquals(cal.multiply(10, 20), 200);
	}
}
