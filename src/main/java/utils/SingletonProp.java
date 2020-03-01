package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author gadeka Properties file implementation using Singleton class Compatible with the Cloning and Serialization.
 *         That means, The class will give the same single instance if we do clone() or writeObject(), readObject()
 *
 */
public class SingletonProp implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	private static SingletonProp SINGLEINSTANCE = null;
	private static final String PROPERTIES_FILE_PATH = "src/main/resources/application.properties";

	private Properties prop = new Properties();

	private SingletonProp() {

	}

	public static SingletonProp getInstance() {
		if (SINGLEINSTANCE == null) {
			synchronized (SingletonProp.class) {
				if (SINGLEINSTANCE == null) {
					try (InputStream is = new FileInputStream(PROPERTIES_FILE_PATH)) {
						SINGLEINSTANCE = new SingletonProp();
						SINGLEINSTANCE.prop.load(is);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}
		}
		return SINGLEINSTANCE;
	}

	@Override
	protected Object clone() {
		return SINGLEINSTANCE;
	}

	protected Object readResolve() {
		return SINGLEINSTANCE;
	}

	public String getPropertyValue(String key) {
		if (key != null && !key.isEmpty()) {
			return prop.getProperty(key);
		}
		return null;
	}

	public Map<String, String> getProperties() {
		Map<String, String> properties = new HashMap<>();
		for (String propKey : prop.stringPropertyNames()) {
			properties.put(propKey, prop.getProperty(propKey));
		}
		return properties;
	}

}
