package ui.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {
    private Properties properties;

    public PropertyLoader(String propertiesFileName) {
        properties = new Properties();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFileName)) {
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new RuntimeException("Property file '" + propertiesFileName + "' not found in the classpath");
            }
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file", e);
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
