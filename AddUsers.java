package test;
import org.testng.annotations.Test;
import baseClass.BaseClass;
import org.openqa.selenium.By;
public class AddUsers extends BaseClass {
@Test
public void Users() {
		
	    driver.findElement(By.xpath("//a[@ng-reflect-router-link='/users']")).click();
        driver.findElement(By.xpath("//span[text()='Add User ']")).click();
        driver.findElement(By.id("mat-input-2")).sendKeys("maya");
        driver.findElement(By.id("mat-input-4")).sendKeys("maya1@gmail.com");
        driver.findElement(By.id("mat-input-5")).sendKeys("5552221111");
        driver.findElement(By.id("mat-input-6")).sendKeys("password");
        driver.findElement(By.xpath("//div[@ng-reflect-ng-switch='true']/following-sibling::div[1]")).click();
        driver.findElement(By.xpath("//mat-pseudo-checkbox[contains(@class,'mat-pseudo-checkbox mat-option-pseudo-checkbox')]")).click();
        driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator button-add')]//span)[3]")).click();
        
     







}

}