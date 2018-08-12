package basic.tests;

import basic.Locators;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;


public class FirstTest {

    private WebDriver driver;

    public FirstTest() {
        //        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

//    @Test
//    public void verifySearchQueryOnUi() {
//        driver.get("https://google.com.ua");
//        driver.findElement(By.id(Locators.SEARCH_INPUT_ID)).clear();
//        driver.findElement(By.id(Locators.SEARCH_INPUT_ID)).sendKeys("Hello World");
//        driver.findElement(By.id(Locators.SEARCH_INPUT_ID)).sendKeys(Keys.ENTER);
//        WebElement firstLink = driver.findElements(By.xpath(Locators.FIRST_LINK_WITH_TEXT_HELLO_WORLD)).get(0);
//        Assert.assertThat("Page does not contain string Hello", firstLink.getText(), containsString("Hello"));
//        Assert.assertThat("Page does not contain string World", firstLink.getText(), containsString("World"));
//    }

    @Test
    public void homeWorkTask1() {
        driver.get("https://rozetka.com.ua");
        driver.findElement(By.xpath("//a[contains(text(), 'Спорт и увлечения')]")).click();
        WebElement firstLink = driver.findElements(By.xpath("//h1[contains(text(), 'Спорт и увлечения')]")).get(0);
        Assert.assertThat("Page does not contain string Спорт и увлечения", firstLink.getText(), containsString("Спорт и увлечения"));
    }

    @Test
    public void homeWorkTask2() {
        driver.get("https://rozetka.com.ua");
        driver.findElement(By.xpath("//a[contains(text(), 'Спорт и увлечения')]")).click();
        WebElement firstLink = driver.findElements(By.xpath("//h1[contains(text(), 'Спорт и увлечения')]")).get(0);
        Assert.assertThat("Page does not contain string Спорт и увлечения", firstLink.getText(), containsString("Спорт и увлечения"));
        driver.findElement(By.xpath("//a[@href='https://rozetka.com.ua/velosipedy-i-aksessuary/c83882/']")).click();
        driver.findElement(By.xpath("//a[@href='https://rozetka.com.ua/bicycles/c83884/']")).click();
        driver.findElement(By.xpath("//img[@src = 'https://i2.rozetka.ua/goods/3671023/formula_ret_frk_20_008_images_3671023195.jpg']")).click();
        driver.findElements(By.xpath("//button[contains (text(), ' Купить')]")).get(0).click();
        driver.findElement(By.xpath("//a[@href='https://my.rozetka.com.ua/cart/']")).click();
        WebElement bicycleLink = driver.findElement (By.xpath("//a[contains(@class,'cart-i-title-link')]"));
        Assert.assertThat("Page does not contain string Formula Speedy 10.5 20 2018", bicycleLink.getText(), containsString("Formula Speedy 10.5 20 2018"));
    }

    @Test
    public void homeWorkTask3() {
        driver.get("https://rozetka.com.ua");
        driver.findElement(By.xpath("//a[@href='https://my.rozetka.com.ua/signin/']")).click();
        driver.findElement(By.xpath("//input[@name = 'login']")).sendKeys("teamlinch@gmail.com");
        driver.findElements(By.xpath("//input[@name='password']")).get(0).sendKeys("QWERTY12");
        driver.findElements(By.xpath("//input[@name='password']")).get(0).sendKeys(Keys.ENTER);
    }

}
