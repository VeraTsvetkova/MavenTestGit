package test2;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.Random;

/**
 * Created by zhivkokasabov on 6/7/2017.
 */
public class TestJava {


    private WebDriver driver;
    private String frontUrl;
    private String jjj;

      @Test

    public  void exvroinsFront(){



        System.setProperty("webdriver.gecko.driver", "C:\\Users\\zhivkokasabov\\automation\\geckodriver.exe");
        this.driver = new org.openqa.selenium.firefox.FirefoxDriver();
        frontUrl =  "http://www.euroinslife.bg/";
        this.driver.navigate().to(frontUrl);


        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public static String generateString(Random rng, String characters, int length)
    {
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
        //System.out.println(text[i]);
    }




}
