package testNG;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lombok.Data;

public class dataProviderTest {

@DataProvider(name="naming")
public String[] names(){
    return new String[]{"prasad","babu","nadimpalli"};
}


    @Test(dataProvider = "naming")
    void example(String name){
        System.out.println("Name is: "+name);
    }


    @DataProvider(name = "combinations")
    public Object[][] generateCombinations() {
        String[] browsers = {"Chrome", "Firefox", "Edge"};
        String[] osList = {"Windows", "Mac", "Linux"};
        String[] screenResolutions = {"1920x1080", "1366x768", "1024x768"};

        List<Object[]> data = new ArrayList<>();
        for (String browser : browsers) {
            for (String os : osList) {
                for (String resolution : screenResolutions) {
                    data.add(new Object[]{browser, os, resolution});
                }
            }
        }
        return data.toArray(new Object[0][0]);
    }

    @Test(dataProvider = "combinations")
    public void testAllCombinations(String browser, String os, String resolution) {
        System.out.println("Testing on Browser: " + browser + ", OS: " + os + ", Resolution: " + resolution);
    }
}

    

