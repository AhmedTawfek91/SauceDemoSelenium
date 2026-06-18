package Utils;

import FileReaders.PropertiesFileReader;

public class Environments {

    static PropertiesFileReader propertiesFileReader = new PropertiesFileReader();

    public static String BASE_URL = propertiesFileReader.getProperty("SAUCE_DEMO_URL");
    public static String LOGIN_USER_NAME = propertiesFileReader.getProperty("SAUCE_DEMO_USER_NAME");
    public static String LOGIN_PASSWORD = propertiesFileReader.getProperty("SAUCE_DEMO_PASSWORD");

    }

