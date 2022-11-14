package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //1-Create the obj of Properties class
    //We need Properties class to use method coming from class like load() and getProperty("key")
    Properties properties = new Properties();

    {

        try {
            //2- Create the obj of FileInputStream
            // We need this obj to open file as a stream in Java memory
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- Load the properties object using FileInputStream object
            // Load "properties" object with the "file" we opened using FileInputStream
            properties.load(file);
        } catch (IOException e) {

        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
