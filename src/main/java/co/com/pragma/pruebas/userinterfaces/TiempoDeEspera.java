package co.com.pragma.pruebas.userinterfaces;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TiempoDeEspera extends PageObject {

    private WebElement ACCEPT_BUTTON;

    public TiempoDeEspera(WebElement acceptButton) {
        ACCEPT_BUTTON = acceptButton;
    }

    public void waitForSubmitButtonToBeClickable() {
        Wait<WebDriver> wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_BUTTON));
    }

    }

