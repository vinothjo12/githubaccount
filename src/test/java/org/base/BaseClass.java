package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;

	
	public static void launchBrowser() {
	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	
}
	
	public static void max() {
			
		driver.manage().window().maximize();
	}

	public static void url(String url) {
		
		driver.get(url);
		
	}

	public static void sendkey(WebElement webelemref, String name) {
		
		webelemref.sendKeys(name);
		
	}

	public static void button(WebElement webelemref) {
		
		webelemref.click();
		
	}

	public static void screenShot(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\VINOTH.S\\eclipse-workspace\\MavenConfig\\ScreenShot\\"+name+".png");
		FileUtils.copyFile(src, des);
}

		public static String readExcel(String path, String name, int row, int cell) throws IOException {

			File f = new File(path);
			
			FileInputStream fi = new FileInputStream(f);
			
			Workbook book = new XSSFWorkbook(fi);
			
			Sheet sheet = book.getSheet(name);
			
			Row rows = sheet.getRow(row);
			
			Cell cells = rows.getCell(cell);
			
			int type = cells.getCellType();
			
			String value;
			
			if (type==1) {
				
				 value = cells.getStringCellValue();
			}
			
			else if (DateUtil.isCellDateFormatted(cells)) {
				
				Date date = cells.getDateCellValue();
				
				SimpleDateFormat s = new SimpleDateFormat("dd, MMMM, yyyy");
				
				 value = s.format(date);
			}
			
			else {
				double d = cells.getNumericCellValue();
			
			long l = (long)d;
			 value = String.valueOf(l);
			
			}
			
			return value;
			
			
			
		}
		
		public static void date() {
			Date d = new Date();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			String format = s.format(d);
			System.out.println(format);

		}
		
		public static void implicityWaits(int sec) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

		}


	

}
