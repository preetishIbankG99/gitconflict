package comm.dummytest;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCl {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://www.pavantestingtools.com");
	// driver.get("https://opensource-demo.orangehrmlive.com/");
//	driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
/*	//using of self
	String text=driver.findElement(By.xpath("//a[normalize-space()='Oberoi Realty']/self::a")).getText();
	System.out.println(text);
	
	//using of parent
	text=driver.findElement(By.xpath("//a[normalize-space()='Oberoi Realty']/parent::td")).getText();
	System.out.println(text);
	
	//using child
	List<WebElement>l=driver.findElements(By.xpath("//a[normalize-space()='Oberoi Realty']/ancestor::tr/child::td"));
    System.out.println(l.size());
    
    //Ancestor
     text=driver.findElement(By.xpath("//a[normalize-space()='Oberoi Realty']/ancestor::tr")).getText();
     System.out.println(text);
     
     //Descendant
     List<WebElement>l2=driver.findElements(By.xpath("//a[normalize-space()='Oberoi Realty']/ancestor::tr//descendant::*"));
     System.out.println(l2.size());
     
    //Following
    List<WebElement>l1=driver.findElements(By.xpath("//a[normalize-space()='Oberoi Realty']/ancestor::tr/following::tr"));
    System.out.println(l1.size());
    
    //Following-Sibling
List<WebElement>l3=driver.findElements(By.xpath("//a[normalize-space()='Oberoi Realty']/ancestor::tr/following-sibling::tr"));
System.out.println(l3.size());

//preceding
List<WebElement>l4=driver.findElements(By.xpath("//a[normalize-space()='Oberoi Realty']/ancestor::tr/preceding::tr"));
System.out.println(l4.size());
//preceding-sibling
List<WebElement>l5=driver.findElements(By.xpath("//a[normalize-space()='Oberoi Realty']/ancestor::tr/preceding-sibling::tr"));
System.out.println(l5.size());*/
//WebElement ele=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
//ele.sendKeys("Admin");
//System.out.println(ele.getText());
	// driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
//	String WindowId= driver.getWindowHandle();
//    System.out.println(WindowId);
    ////a[text()='OrangeHRM, Inc']
 /*   Set<String>WindowIds=driver.getWindowHandles();
    //Using Iterator Method
    Iterator<String>itr=WindowIds.iterator();
    String parentWindowId=itr.next();
    String childWindowId=itr.next();
    System.out.println("Parent WindowID is ::: "+parentWindowId);
    System.out.println("Child WindowID is :::: "+childWindowId);
    
    
   List<String>WindowIdList=new ArrayList(WindowIds);//converting set to arrays
    String parentWindowId=WindowIdList.get(0);
    String childWindowId=WindowIdList.get(1);
    System.out.println("Parent WindowID is ::: "+parentWindowId);
    System.out.println("Child WindowID is :::: "+childWindowId);

    //using window id for Switching
    driver.switchTo().window(parentWindowId);
    System.out.println("Parent Window Title is:: "+driver.getTitle());
    
    driver.switchTo().window(childWindowId);
    System.out.println("child Window Title is:: "+driver.getTitle());
    
    for(String winid:WindowIdList) {
    	String title=driver.switchTo().window(winid).getTitle();
    	System.out.println(title);
    if(title.equals("OrangeHRM")) {
    	
    }
    driver.close();
    }*/
  WebElement link=  driver.findElement(By.xpath("//*[@id=\"menu-primary-items\"]/li[4]/a"));
	link.click(); 
  driver.navigate().back();
	 Thread.sleep(4000);
	 try {
	 link.click();
	 }
	 catch(StaleElementReferenceException e){
		 link=  driver.findElement(By.xpath("//*[@id=\"menu-primary-items\"]/li[4]/a"));
		 link.click();
	 }
	 }
}
