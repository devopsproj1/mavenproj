import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

@Test
public class demoautomation {

    @Test
    public void disp() {
        System.out.println("test pass");
    }

    @Test
    void due() {
        System.out.println("sec test");
    }

    @Test
    void Login() {
        WebDriver driver = new ChromeDriver();

        driver.get("www.google.com");


    }
}
