package FileReaders;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

    Properties pro;
    public PropertiesFileReader()
    {
        this.pro = new Properties();
        readFile();
    }

    private void readFile() {

        try {
            FileInputStream file = new FileInputStream("src/main/resources/ExternalFiles/LoginCredentials.properties");
            pro.load(file);
        } catch (IOException e) {
            System.out.println("Error loading properties file: " + e.getMessage());
        }
    }

    public String getProperty(String key) {
        return pro.getProperty(key);
    }


}


