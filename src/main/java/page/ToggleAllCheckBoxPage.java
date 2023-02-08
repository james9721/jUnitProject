package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllCheckBoxPage extends BasePage {
	WebDriver driver;
	public ToggleAllCheckBoxPage  (WebDriver driver) {
		this.driver = driver;
	}
	
@FindBy(how = How.NAME, using= "allbox") WebElement Check_Box;
@FindBy(how = How.NAME, using = "todo[0]") WebElement List_Item;
@FindBy(how = How.CSS, using = "input[value='Remove']")WebElement Remove_Button;
@FindBy(how = How.NAME, using = "data")WebElement Text_Box_For_Add;
@FindBy(how = How.CSS, using = "input[value='Add']")WebElement Add_Button;

public void clickCheckBox() {
	Check_Box.click();
}
public void checkBoxValidation() {
	if(Check_Box.isSelected()) {
		System.out.println("Checkbox is selected!");
	}
	
}
public void clickListItem() {
	List_Item.click();
}
public void addName() {
	String RndAdd = "i" + generateRndomNum(999);
	Text_Box_For_Add.sendKeys(RndAdd);
}
public void clickAdd() {
	Add_Button.click();
}
public void removeButton() {
	Remove_Button.click();
}
public void removeListItemValidation() {
try {List_Item.click();
	Remove_Button.click();
	System.out.println("Single list Item has been Removed");
	
} catch (Exception e) {
	e.printStackTrace();
}
	
	}
}


