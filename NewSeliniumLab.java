




package selium;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class NewSeliniumLab {
public static void main(String[] args) { 
System.setProperty("webdriver.chrome.driver","C:\\Users\\sankee\\eclipse-workspace\\sese\\wqw\\chromedriver.exe"); 
WebDriver driver = new ChromeDriver(); 
driver.get("https://demoqa.com/automation-practice-form/"); 
driver.findElement(By.id("firstName")); 
driver.get("https://demoqa.com/automation-practice-form/"); 
driver.findElement(By.name("gender"));
driver.get("https://demoqa.com/automation-practice-form/"); 
driver.findElement(By.className("practice-form-wrapper")); 
driver.get("https://demoqa.com/text-box"); 
driver.findElement(By.xpath("//input[@id='userName']")); 
 driver.close(); 
 }} 
