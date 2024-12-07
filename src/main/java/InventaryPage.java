import io.opentelemetry.api.common.Attributes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import java.util.List;


public class InventoryPage {

        private WebDriver driver;

        public InventoryPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);

    }
    @FindBy(className = "inventory_item")
        private List<WebElement>;

        public void selectItemByname(String itemName) {
            for(int i = 0; i < inventoryItemList.size(); i++) {
                if(inventoryItemList.get(i).getText().contains(itemName)) {

                }
            }

        }
}
