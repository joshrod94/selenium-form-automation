import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FormAutomationDemo {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver executable
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        // Look for the first name field
        List<WebElement> firstName = driver.findElements(By.name("firstname"));
        if (!firstName.isEmpty()) {
            firstName.get(0).sendKeys("John");
        } else {
            System.out.println("First name field not found.");
        }
        // Look for the last name field
        List<WebElement> lastName = driver.findElements(By.name("lastname"));
        if (!lastName.isEmpty()) {
            lastName.get(0).sendKeys("Doe");
        } else {
            System.out.println("Last name field not found.");
        }
        // Look for the gender radio buttons
        List<WebElement> gender = driver.findElements(By.cssSelector("input[name='sex'][value='Male']"));
        if (!gender.isEmpty()){
            gender.get(0).click();
        } else {
            System.out.println("No Male gender radio button found.");
        }
        // Look for the experience radio buttons
        List<WebElement> experience = driver.findElements(By.cssSelector("input[name='exp'][value='2']"));
        if (!experience.isEmpty()){
            experience.get(0).click();
        } else {
            System.out.println("No 2 years of experience radio button found.");
        }
        // Look for the date field
        List<WebElement> date = driver.findElements(By.id("datepicker"));
        if (!date.isEmpty()){
            date.get(0).sendKeys("01/01/2023");
        } else {
            System.out.println("Date field not found.");
        }
        // Look for the profession checkboxes
        List<WebElement> profession = driver.findElements(By.cssSelector("input[name='profession'][value='Automation Tester']"));
        if (!profession.isEmpty()){
            profession.get(0).click();
        } else {
            System.out.println("No Automation Tester checkbox found.");
        }
        // Look for the tool checkboxes
        List<WebElement> tool = driver.findElements(By.cssSelector("input[name='tool'][value='Selenium Webdriver']"));
        if (!tool.isEmpty()){
            tool.get(0).click();
        } else {
            System.out.println("No Selenium Webdriver checkbox found.");
        }
        // Look for the continent dropdown
        List<WebElement> continent = driver.findElements(By.id("continents"));
        if (!continent.isEmpty()){
            continent.get(0).sendKeys("North America");
        } else {
            System.out.println("Continent dropdown not found.");
        }
        // Look for the commands dropdown
        List<WebElement> commands = driver.findElements(By.id("selenium_commands"));
        if (!commands.isEmpty()){
            // Look for the commands dropdown
                    List<WebElement> commandsElements = driver.findElements(By.id("selenium_commands"));
                    if (!commandsElements.isEmpty()){
                        Select commandsSelect = new Select(commandsElements.get(0));
                        // Verify it allows multiple selections
                        if (commandsSelect.isMultiple()) {
                            commandsSelect.selectByVisibleText("Browser Commands");
                            commandsSelect.selectByVisibleText("Navigation Commands");
                            commandsSelect.selectByVisibleText("WebElement Commands");
                        } else {
                            System.out.println("Commands dropdown doesn't support multiple selections.");
                        }
                    } else {
                        System.out.println("Commands dropdown not found.");
                    }
        } else {
            System.out.println("Commands dropdown not found.");
        }
        // Look for the submit button
        List<WebElement> submitButton = driver.findElements(By.id("submit"));
        if (!submitButton.isEmpty()){
            submitButton.get(0).click();
            System.out.println("Form submitted successfully.");
        } else {
            System.out.println("Submit button not found.");
        }
        // Close the browser
        driver.quit();
    }
}
