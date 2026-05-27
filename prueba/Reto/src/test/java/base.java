import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;




public class base {

    public WebDriver driver;
    public WebDriverWait wait;
    public ChromeOptions options;



    public base(WebDriver driver) {
    }


    public WebDriver chromeconnection() {

        System.setProperty("webdriver.chrome.driver",
                "./src/test/resources/chromedriver-win64/chromedriver.exe");



        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        return driver;
    }

    public void visit(String url) {
        driver.get(url);
    }

    public void insert(String inputText, By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();

    }


    public void setOptions(ChromeOptions options) {
        this.options = options;
    }
}







