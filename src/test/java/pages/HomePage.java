package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By linkEda = By.xpath("//li[@class='header__nav-item mob-margin header__nav-item-right' and contains(., 'Рестораны')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
