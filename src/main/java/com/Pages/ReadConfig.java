package com.Pages;

import com.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig extends Base {

        public static String readConfig(String configKey) throws IOException {

            FileInputStream fileInputStream = new FileInputStream("C:\\general1\\src\\test\\resources\\config.properties");
            Properties prop = new Properties();
            prop.load(fileInputStream);
            String configValue = (String)
                    prop.get(configKey);
            return configValue;
        }


    }

