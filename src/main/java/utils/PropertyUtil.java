package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author gadeka read/write property file using java 8
 *
 */
public class PropertyUtil {

	final private static String PROPERTIES_FILE_PATH = "src/main/resources/application.properties";

	public static void main(String[] args) {
		// new PropertyUtil().WriteToProperty();
		// new PropertyUtil().ReadProperty();
		// new PropertyUtil().LoadPropClassPath();
		System.out.println(SingletonProp.getInstance().getProperties());
		System.out.println(TestDataProperties.getInstance().getValue("db.url"));
	}

	/**
	 * Method to write to a properties file
	 */
	public void WriteToProperty() {
		Properties prop = new Properties();
		try (OutputStream os = new FileOutputStream(PROPERTIES_FILE_PATH)) {
			prop.setProperty("db.url", "sampleurl");
			prop.setProperty("db.user", "gadeka");
			prop.setProperty("db.password", "test123");
			prop.store(os, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method to read from a properties file
	 */
	public void ReadProperty() {
		Properties prop = new Properties();
		try (InputStream is = new FileInputStream(PROPERTIES_FILE_PATH)) {
			prop.load(is);
			System.out.println(prop.getProperty("db.url"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method to read from properties file using resource as stream
	 */
	public void LoadPropClassPath() {
		Properties prop = new Properties();
		try (InputStream is = getClass().getClassLoader().getResourceAsStream("application.properties")) {
			prop.load(is);
			prop.forEach((key, value) -> System.out.println(key + "-" + value));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
