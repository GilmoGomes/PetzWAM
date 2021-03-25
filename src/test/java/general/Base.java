package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    public WebDriver driver; //objeto do selenimum webdriver , vulgo bola
    //^ ao usar page Factory mudar de pulic para proctected

    // v - criar um construtor e iniciarlizar os elementos do PageFactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
