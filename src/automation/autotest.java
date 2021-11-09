package automation;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("unused")
public class autotest {

private static final String parentHandle = null;
private static Object child_window;

//	private static Select select1;
//	private static Select select;

	public static <Product> void main(String[] args) throws Exception { 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/st/Downloads/chromedriver_linux64 (1)/chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("https://sumanas.medizura.com/login");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.xpath("//body/app-root[1]/app-blank[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("ajay"); 
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/app-blank[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("123456");
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/app-blank[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/select[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-blank[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/select[1]/option[2]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/app-blank[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.findElement(By.xpath("//app-header/nav[1]/div[2]/app-navigation[1]/ul[1]/li[6]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='patientName']")).sendKeys("p");
		Thread.sleep(3000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ngb-typeahead-window[1]/button[2]/ngb-highlight[1]")).click();
		d.findElement(By.xpath("//input[@id='doctorName']")).sendKeys("T");
		Thread.sleep(3000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ngb-typeahead-window[1]/button[1]/ngb-highlight[1]")).click();
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/app-upsert-sale/form/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/label")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/app-upsert-sale/form/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/label")).click();
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/select[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/select[1]/option[2]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/select[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/select[1]/option[4]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[contains(text(),'Set')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/app-upsert-sale/form/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/label")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/app-upsert-sale/form/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/label")).click();
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/select[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/select[1]/option[2]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id=\"selectProduct0\"]")).sendKeys("A");
		Thread.sleep(8000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/app-common-sale-form-elements[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ngb-typeahead-window[1]/button[9]/ngb-highlight[1]")).click();
		Thread.sleep(5000);			
		d.findElement(By.xpath("//select[@id='selectBatch0']")).click();
		Thread.sleep(3000);

		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/app-common-sale-form-elements[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/select[1]/option[2]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='saleQty0']")).sendKeys("1");
		Thread.sleep(3000);
		d.findElement(By.xpath("//tbody/tr[1]/td[7]/select[1]")).click();
		Thread.sleep(3000);

		d.findElement(By.xpath("//option[contains(text(),'30049088')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//tbody/tr[1]/td[8]/input[1]")).sendKeys("1");
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[contains(text(),'Add Product')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='selectProduct1']")).sendKeys("A");
		Thread.sleep(8000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/app-common-sale-form-elements[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/ngb-typeahead-window[1]/button[3]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//select[@id='selectBatch1']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/app-common-sale-form-elements[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/select[1]/option[2]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='saleQty1']")).sendKeys("1");
		Thread.sleep(3000);
///		d.findElement(By.xpath("")).click();
///		Thread.sleep(3000);
		
		d.findElement(By.xpath("//tbody/tr[2]/td[7]/select[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//tbody/tr[2]/td[7]/select[1]/option[2]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//tbody/tr[2]/td[8]/input[1]")).sendKeys("1");
		Thread.sleep(3000);
	
///		d.findElement(By.xpath(")).sendKeys("1");
///		Thread.sleep(3000);
		
		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/app-common-sale-form-elements[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/app-common-sale-form-elements[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/app-common-sale-form-elements[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]/option[4]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/app-common-sale-form-elements[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("1234");
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/app-common-sale-form-elements[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("1");
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/div[2]/div[1]/div[1]/button[2]")).click();
		Thread.sleep(3000);
		d.navigate().forward();
		Thread.sleep(3000);
//		d.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/app-breadcrumb/div/div/div/div[2]/div/button")).click();
//		Thread.sleep(3000);
//		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-sales[1]/div[2]/div[1]/div[1]/div[2]/label[2]/input[1]")).sendKeys("Ragu");
//		Thread.sleep(5000);
//		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-sales[1]/div[2]/div[1]/div[2]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[1]/div[1]/a[1]/i[1]")).click();
//		Thread.sleep(5000);
//		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-sales[1]/div[2]/div[1]/div[2]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/div[1]/div[1]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[6]/div[1]/a[1]/i[1]")).click();
//		Thread.sleep(5000);
///		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-sales[1]/div[2]/div[1]/div[2]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/div[1]/div[1]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[6]/datatable-body-row[1]/div[2]/datatable-body-cell[6]/div[1]/a[1]/i[1]")).click();
//		Thread.sleep(5000);
//		d.findElement(By.xpath("//button[contains(text(),'Add Product')]")).click();
//		Thread.sleep(5000);
//		d.findElement(By.xpath("//input[@id='selectProduct1']")).sendKeys("d");
//		Thread.sleep(5000);
//		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/app-common-sale-form-elements[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/ngb-typeahead-window[1]/button[2]")).click();
//		Thread.sleep(5000);
//		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/app-common-sale-form-elements[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/select[1]")).click();
//		Thread.sleep(5000);
//		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/app-common-sale-form-elements[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/select[1]/option[2]")).click();
//		Thread.sleep(5000);
//		d.findElement(By.xpath("//input[@id='saleQty1']")).sendKeys("1");
//		Thread.sleep(5000);
//		d.findElement(By.xpath("//tbody/tr[2]/td[7]/select[1]")).click();
//		Thread.sleep(5000);
//		d.findElement(By.xpath("//tbody/tr[2]/td[7]/select[1]/option[2]")).click();
//		Thread.sleep(5000);
//		d.findElement(By.xpath("//tbody/tr[2]/td[8]/input[1]")).sendKeys("1");
//		Thread.sleep(3000);
//		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale[1]/form[1]/div[2]/div[1]/div[1]/button[2]")).click();
//		Thread.sleep(5000);
//		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-sales[1]/div[2]/div[1]/div[2]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[2]/datatable-body-row[1]/div[2]/datatable-body-cell[1]/div[1]/a[1]/i[1]")).click();
//		Thread.sleep(6000);
//		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-sales[1]/div[2]/div[1]/div[2]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[2]/div[1]/div[1]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[6]/div[1]/a[2]/i[1]")).click();
//		Thread.sleep(5000);
		
		d.navigate().forward();
		Thread.sleep(5000);
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[1]/ul/li[2]/a/span")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/app-upsert-sale-return/div/div/div/div/div/div/input")).sendKeys("m");
		Thread.sleep(3000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale-return[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ngb-typeahead-window[1]/button[2]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).sendKeys("2");
		Thread.sleep(3000);
		d.findElement(By.xpath("//label[contains(text(),'On')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale-return[1]/div[1]/div[1]/div[2]/form[1]/app-common-sale-return-form-elements[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/label[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='selectProduct0']")).sendKeys("A");
		Thread.sleep(3000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale-return[1]/div[1]/div[1]/div[2]/form[1]/app-common-sale-form-elements[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ngb-typeahead-window[1]/button[3]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//select[@id='selectBatch0']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale-return[1]/div[1]/div[1]/div[2]/form[1]/app-common-sale-form-elements[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/select[1]/option[2]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='saleQty0']")).sendKeys("3");
		Thread.sleep(3000);
		d.findElement(By.xpath("//tbody/tr[1]/td[7]/select[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale-return[1]/div[1]/div[1]/div[2]/form[1]/app-common-sale-form-elements[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/select[1]/option[2]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale-return[1]/div[1]/div[1]/div[2]/form[1]/app-common-sale-form-elements[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("4");
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/app-full-width-left[1]/div[1]/div[1]/div[1]/app-upsert-sale-return[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/button[2]")).click();
		Thread.sleep(3000);
		
//		System.out.println("The title of the main window :"+ d.getTitle());
//		
//		Set<String> windowlds = d.getWindowHandles();
//		Iterator<String> iter = windowlds.iterator();
//		
//		String mainwindow = iter.next();
//		String childwindow = iter.next();
//		
//		d.switchTo().window(childwindow);
//		
//		System.out.println("The title of the child window :"+ d.getTitle());
//		
//		d.close();
//		Thread.sleep(3000);
//		
//		d.switchTo().window(mainwindow);
//		System.out.println("The title of the main window :"+ d.getTitle());
//		Thread.sleep(3000);
//		d.switchTo().alert().dismiss();
//		Thread.sleep(3000);
//
//		By.cssSelector(childwindow);
//		d.findElement(By.xpath("//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[1]")).click();
		
		
//		Set<String>s=d.getWindowHandles();
//		Iterator<String> I1= s.iterator();
//		while(I1.hasNext())
//		{
//		String child_window=I1.next();
//		Object parent = 1;
//		if(!parent.equals(child_window))
//		{
//			String alertMessage= d.switchTo().alert().getText();
//		d.findElement(By.xpath("//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[1]")).click();
//			System.out.println(d.switchTo().window(child_window).getTitle());
//		Thread.sleep(6000);
//		
//			d.close();
//		}
//		}
//		String parent = null;
//		d.switchTo().window(parent);
//
//	
//		d.findElement(By.xpath("//a[@class='cancel-button']")).click();
//		String paretHandle = d.getWindowHandle();
//		System.out.println("parent window -"+parentHandle);
//		Set<String> handles = d.getWindowHandles();
//		for (String handle : handles) {
//			System.out.println(handle);
//		}
//		
		
//		d.switchTo().window("1");
//		d.findElement(By.id("sidebar")).click();
//				
//		WebElement clickElement = d.findElement(By.id("cancel-button"));
//		for(int i = 0; i < 3; i++)
//		{
//		clickElement.click();
//		Thread.sleep(3000);
//		}
//	
//		String parent=d.getWindowHandle();
//		Set<String>s=d.getWindowHandles();
//		if(!parent.equals(child_window))
//			d.switchTo().window((String) child_window);
//		d.close();
//		d.switchTo();
//	
//		d.findElement(By.xpath("//span[class=\"cancel-button\"]")).click();
//		Thread.sleep(3000);
		
		
//		WebElement crbutton= d.findElement(By.xpath("//button[class()='cancel-button']"));
//		WebDriverWait wait = new WebDriverWait(d, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(crbutton));
//		crbutton.click();
		
//		d.findElement(By.cssSelector("div[class='cancel-button'] [role='button']")).click();
		
		
//	     d.close();
	}

	private static void options(String string) {
		// TODO Auto-generated method stub
		
	}

	}


