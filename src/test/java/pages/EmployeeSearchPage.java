package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethods;

public class EmployeeSearchPage extends CommonMethods {
    @FindBy(id="menu_pim_viewPimModule")
    public WebElement empListOption;

    @FindBy(xpath="(//*[@type='text'])[1]")
    public WebElement nameFIeld;

    @FindBy(id="emsearch_id")
    public WebElement idField;

    @FindBy(id="searchBtn")
    public WebElement searchButton;


}
