package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base{
    private Base base; // cria o objeto interno local para a comunicacao com o objeto da classe extendia(selenimum)

    // construtor para calsse Base
    public Hooks(Base base){
        super(base.driver);
        this.base = base;
    }
    //Before
    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88/chromedriver.exe");
        base.driver = new ChromeDriver(); // Instanciou o Selenium como Chrome

        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);




    }

    //Affer
    @After
    public void tearDown() {
        base.driver.quit();



    }


}
