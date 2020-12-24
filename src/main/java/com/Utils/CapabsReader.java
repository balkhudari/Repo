package com.Utils;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CapabsReader {

    public CapabsReader(){ }

    public DesiredCapabilities getCapabilities() throws IOException {
        DesiredCapabilities capabs= new DesiredCapabilities();
        BufferedReader reader;

        try {
            reader =new BufferedReader(new FileReader(System.getProperty("user.dir")+ "/capabs/android.txt"));

            String line =reader.readLine();
            while (line != null){
                System.out.println(line);
                line =reader.readLine();

                String[] cap= line.split("=");
                capabs.setCapability(cap[0],cap[1]);
            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return capabs;
    }
}
