import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homework4 {


    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    }
    @Test
    public void test(){

    }
}
