package com.cydeo.tests.day9_properties_configuration_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file_test() throws IOException {

        //1-Create the obj of Properties class
        //We need Properties class to use method coming from class like load() and getProperty("key")
        Properties properties = new Properties();

        //2- Create the obj of FileInputStream
        // We need this obj to open file as a stream in Java memory
        FileInputStream file = new FileInputStream("configuration.properties");

        //3- Load the properties object using FileInputStream object
        // Load "properties" object with the "file" we opened using FileInputStream
        properties.load(file);
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"environment\") = " + properties.getProperty("env"));


    }
}
