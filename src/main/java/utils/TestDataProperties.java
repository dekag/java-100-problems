package utils;

import java.io.IOException;
import java.util.Properties;

/**
 * @author gadeka Another example of singleton get properties
 *
 */
public class TestDataProperties {

	private static TestDataProperties instance = null;
	private Properties properties;

	private TestDataProperties() throws IOException {
		properties = new Properties();
		properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
	}

	public static TestDataProperties getInstance() {
		if (instance == null) {
			try {
				instance = new TestDataProperties();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		return instance;
	}

	public String getValue(String key) {
		return properties.getProperty(key);
	}

}