package actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyAction {
    public static String getProperty(String url){
        String file="src/main/resources/Config.properties";
        Properties properties;
        FileReader fileReader;
        try {
            fileReader=new FileReader(file);
            properties=new Properties();
            properties.load(fileReader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties.getProperty(url);
    }
}
