package pages;

import driver.InitWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage extends InitWebDriver {

    public void setText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public Boolean verifyElementIsPresent(By locator) {
        List<WebElement> elements = driver.findElements(locator);
        return elements != null && elements.size() > 0;
    }

    public Boolean verifyElementNotPresent(By locator) {
        return driver.findElements(locator).size() == 0;
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }
}