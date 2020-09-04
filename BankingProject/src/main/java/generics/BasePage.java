package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public static void selectByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public static void selectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);;
	}
	
	public static void selectByIndex(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public static void moveToElement(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void moveByOffset(WebDriver driver, int xOffset, int yOffset)
	{
		Actions act = new Actions(driver);
		act.moveByOffset(xOffset, yOffset).perform();
	}

}
