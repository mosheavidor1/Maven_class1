import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)
    public class MyDriverTest {

        private static WebDriver driver;

        @BeforeClass
        public static void bc() throws MalformedURLException {
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         driver.get("http://localhost:8080/");
        }

        @Test
        public void test01_login() {
            driver.get("http://localhost:8080/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.findElement(By.id("j_username")).sendKeys("moshe");
            driver.findElement(By.name("j_password")).sendKeys("Smile2008@");
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.findElement(By.name("Submit")).click();

        }


//
//        @AfterClass
//        public static void ac() {
//            driver.quit();
//        }
//
  }


