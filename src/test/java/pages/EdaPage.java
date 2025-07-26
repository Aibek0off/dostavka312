package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EdaPage extends BasePage {
    private By kfcPage = By.cssSelector("a.popular__item[href*=\"kfc\"]");
    private By faizaPage = By.cssSelector("a.popular__item[href*=\"faiza\"]");
    private By ashlyanfu1Page = By.cssSelector("a.popular__item[href*=\"ashlyanfu-1\"]");
    private By crazyBrothersPage = By.cssSelector("a.popular__item[href*=\"crazy-brothers\"]");
    private By centrPlovaPage = By.cssSelector("a.popular__item[href*=\"centr-plova\"]");

    public EdaPage(WebDriver driver) {
        super(driver);
    }

    public void clickKFCPage() {
        scrollAndClick(kfcPage);
    }

    public void clickFaizaPage() {
        scrollAndClick(faizaPage);
    }

    public void clickAshlyanfu1Page() {
        scrollAndClick(ashlyanfu1Page);
    }

    public void clickCrazyBrothersPage() {
        scrollAndClick(crazyBrothersPage);
    }

    public void clickCentrPlovaPage() {
        scrollAndClick(centrPlovaPage);
    }
}
