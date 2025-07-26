package tests;

import base.BaseTest;
import io.qameta.allure.Allure;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EdaPage;

public class EdaTest extends BaseTest {
    private EdaPage edaPage;

    @BeforeMethod
    public void openEdaPage() {
        driver.get("https://dostavka312.kg/eda");
        edaPage = new EdaPage(driver);
    }

    @Description("Проверяем открытие страницу")
    @Test
    public void openKfcPage() {
        Allure.step("клик по странице", () ->
                edaPage.clickKFCPage());
        String actualUrl = Allure.step("actual URL", () ->
                edaPage.getURL("https://dostavka312.kg/cata-evropeyskaya-kukhnya/kfc"));
        Allure.step("check URL", () ->
                Assert.assertEquals(actualUrl, "https://dostavka312.kg/cata-evropeyskaya-kukhnya/kfc"));
    }

    @Description("Проверяем открытие страницу")
    @Test
    public void openFaizaPage() {
        Allure.step("клик по странице", () ->
                edaPage.clickFaizaPage());
        String actualUrl = Allure.step("actual URL", () ->
                edaPage.getURL("https://dostavka312.kg/cata-nacionalnaya-kukhnya/faiza"));
        Allure.step("check URL", () ->
                Assert.assertEquals(actualUrl, "https://dostavka312.kg/cata-nacionalnaya-kukhnya/faiza"));
    }

    @Description("Проверяем открытие страницу")
    @Test
    public void openAshlyanfu1Page() {
        Allure.step("клик по странице", () ->
                edaPage.clickAshlyanfu1Page());
        String actualUrl = Allure.step("actual URL", () ->
                edaPage.getURL("https://dostavka312.kg/cata-nacionalnaya-kukhnya/-ashlyanfu-1-"));
        Allure.step("check URL", () ->
                Assert.assertEquals(actualUrl, "https://dostavka312.kg/cata-nacionalnaya-kukhnya/-ashlyanfu-1-"));
    }

    @Description("Проверяем открытие страницу")
    @Test
    public void openCrazyBrothersPage() {
        Allure.step("клик по странице", () ->
                edaPage.clickCrazyBrothersPage());
        String actualUrl = Allure.step("actual URL", () ->
                edaPage.getURL("https://dostavka312.kg/cata-picceriya-i-fastfud/crazy-brothers-(chetyrekhetazhnaya-picca)"));
        Allure.step("check URL", () ->
                Assert.assertEquals(actualUrl, "https://dostavka312.kg/cata-picceriya-i-fastfud/crazy-brothers-(chetyrekhetazhnaya-picca)"));
    }

    @Description("Проверяем открытие страницу")
    @Test
    public void openCentrPlovaPage() {
        Allure.step("клик по странице", () ->
                edaPage.clickCentrPlovaPage());
        String actualUrl = Allure.step("actual URL", () ->
                edaPage.getURL("https://dostavka312.kg/cata-nacionalnaya-kukhnya/centr-plova"));
        Allure.step("check URL", () ->
                Assert.assertEquals(actualUrl, "https://dostavka312.kg/cata-nacionalnaya-kukhnya/centr-plova"));
    }
}
