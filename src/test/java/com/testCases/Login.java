

import java.time.Duration;

public class LoginTest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Set path to chromedriver if not in PATH
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testLogin() {

        // Open login page
        driver.get("https://example.com/login");

        // Locate username field
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("your_username");

        // Locate password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("your_password");

        // Click login button
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        // Optional validation (example)
        // Assert something after login
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL after login: " + currentUrl);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}