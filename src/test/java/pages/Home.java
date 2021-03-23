package pages;

import general.Base; //importando a base do geral pq o construtor mais simples
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {

    // 1 - mapeameto de elementos

    @FindBy(id = "search")
    private WebElement txtInputSearch;


    @FindBy(css = "button.button-search")
    private WebElement btnSearch;


    // 2 - Construtor

    public Home(WebDriver driver) {
        super(driver);



    }


    // 3 - Ações dos Elementos

        public void search(String product){

        txtInputSearch.click(); //clicar na caixa de pesquisa
        txtInputSearch.clear(); //limpa a caixa de pesquisa
        txtInputSearch.sendKeys(product); // escreve na caixa de texto


    }
    public void searchWithMagnifierButton(String product){
        search(product);
        btnSearch.click(); //clicar no botao da lupa

    }


        //feature -- >Steps -> searcgwhit ----> search

    public void searchWithEnter(String product){

        search(product);
        txtInputSearch.sendKeys(Keys.ENTER);



    }





}
