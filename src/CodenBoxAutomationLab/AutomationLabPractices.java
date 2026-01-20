package CodenBoxAutomationLab;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationLabPractices {

	public String Website = "https://codenboxautomationlab.com/practice/";
	WebDriver driver = new ChromeDriver();
	Random rand = new Random();

	@BeforeTest
	public void MySsetup() {

		driver.get(Website);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@Test(enabled = false)
	public void RadioButton() {

		WebElement RadioBox = driver.findElement(By.id("radio-btn-example"));

		List<WebElement> RadioButtons = RadioBox.findElements(By.className("radioButton"));

		int RandomInput = rand.nextInt(RadioBox.findElements(By.className("radioButton")).size());

		RadioButtons.get(RandomInput).click();

	}

	@Test(enabled = false)
	public void Dynamic_Drop_Down() throws InterruptedException {

		String[] Countries = { "jor", "Ir", "Saudi" };

		int RandomCountry = rand.nextInt(Countries.length);

		WebElement CountryPlaceHolder = driver.findElement(By.id("autocomplete"));

		CountryPlaceHolder.sendKeys(Countries[RandomCountry]);

		Thread.sleep(3000);

		CountryPlaceHolder.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

	}

	@Test(enabled = false)
	public void StaticDropDown() {

		WebElement MySelector = driver.findElement(By.id("dropdown-class-example"));

		int Choices = MySelector.findElements(By.tagName("option")).size();

		Select select = new Select(MySelector);

		int RandomChoice = rand.nextInt(1, Choices);

		select.selectByIndex(RandomChoice);

	}

	@Test(enabled = false)
	public void CheckBox() {

		WebElement CheckBox = driver.findElement(By.id("checkbox-example"));

		List<WebElement> CheckOptions = CheckBox.findElements(By.tagName("input"));

		for (int i = 0; i < CheckOptions.size(); i++) {

			CheckOptions.get(i).click();

		}

	}

	@Test(enabled = false)
	public void SwitchWindowExample() throws InterruptedException {

		driver.findElement(By.id("openwindow")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> alltabs = new ArrayList<>(handles);
		driver.switchTo().window(alltabs.get(1));

		driver.findElement(By.xpath("//li[@id='menu-item-9680']//a")).click();

	}

	@Test(enabled = false)
	public void OpenTab() {

		driver.findElement(By.id("opentab")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> Alltabs = new ArrayList<>(handles);
		driver.switchTo().window(Alltabs.get(1));
		driver.switchTo().window(Alltabs.get(0));
		driver.switchTo().window(Alltabs.get(1));
		driver.switchTo().window(Alltabs.get(0));
		driver.switchTo().window(Alltabs.get(1));
		driver.switchTo().window(Alltabs.get(0));

	}

	@Test(enabled = false)
	public void AlertAndConfirm() throws InterruptedException {

		// driver.findElement(By.id("name")).sendKeys("Mohammad");
		// Thread.sleep(3000);
		// driver.findElement(By.id("alertbtn")).click();

		// driver.switchTo().alert().accept();

		driver.findElement(By.id("name")).sendKeys("Mohammad");
		Thread.sleep(3000);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);

		driver.switchTo().alert().accept();

	}

	@Test(enabled = false)

	public void HideAndShow() throws InterruptedException {

		driver.findElement(By.id("show-textbox")).click();
		boolean expectedvalue1 = true;
		Assert.assertEquals(driver.findElement(By.id("displayed-text")).isDisplayed(), expectedvalue1);
		Thread.sleep(3000);

		driver.findElement(By.id("hide-textbox")).click();
		driver.findElement(By.id("displayed-text")).isDisplayed();
		boolean expectedvalue = false;
		Assert.assertEquals(driver.findElement(By.id("displayed-text")).isDisplayed(), expectedvalue);

	}

	@Test(enabled = false)
	public void EnabledAndDisenabled() {

		driver.findElement(By.id("enabled-button")).click();
		driver.findElement(By.id("enabled-example-input")).isEnabled();
		boolean expectResult = true;
		Assert.assertEquals(driver.findElement(By.id("enabled-example-input")).isEnabled(), expectResult);

		driver.findElement(By.id("disabled-button")).click();
		driver.findElement(By.id("enabled-example-input")).isEnabled();
		boolean expectResult1 = false;

		Assert.assertEquals(driver.findElement(By.id("enabled-example-input")).isEnabled(), expectResult1);

	}

	@Test(enabled = false)
	public void MouseHover() throws InterruptedException {

		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("window.scrollTo(0,2000)");

		WebElement hoverbox = driver.findElement(By.id("mousehover"));

		Actions myaction = new Actions(driver);

		myaction.moveToElement(hoverbox).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Top")).click();

	}

	@Test(enabled = false)
	public void Table() {

		WebElement Table = driver.findElement(By.id("product"));
		List<WebElement> AllRowsInsideTable = Table.findElements(By.tagName("tr"));

		// for(int i = 0 ; i < AllRowsInsideTable.size(); i++) {

		// System.out.println(AllRowsInsideTable.get(i).getText());

		for (int i = 1; i < AllRowsInsideTable.size(); i++) {
			System.out.println(AllRowsInsideTable.get(i).findElements(By.tagName("td")).get(0).getText());
		}
	}

	@Test(enabled = false)

	public void iframe() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,2300)");

		Thread.sleep(3000);

		driver.switchTo().frame(0);

		driver.findElement(By.cssSelector(".ct-mobile-meta-item.btn-nav-mobile.open-menu")).click();

	}
	
	
}
