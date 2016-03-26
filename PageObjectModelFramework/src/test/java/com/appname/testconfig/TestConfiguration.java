package com.appname.testconfig;

import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class TestConfiguration {

	public WebDriver driver;
	public String url;

	@BeforeClass
	public void beforeClass() throws EncryptedDocumentException, InvalidFormatException, IOException {
		//String browserName = GenericUtil.getExcelData("./data/TestData.xlsx", "Config", 1, 0);
		//url = GenericUtil.getExcelData("./data/TestData.xlsx", "Config", 1, 1);
		
		File f=new File("./data/TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=WorkbookFactory.create(fis);
		String url= wb.getSheet("Config").getRow(1).getCell(1).toString();
		
		String browserName=wb.getSheet("Config").getRow(1).getCell(0).toString();
		
		wb.getSheet("Config").getRow(1).createCell(2).setCellValue("http://www.google.com");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		wb.write(fos);
		
        fos.close();
		
		if (browserName.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("gc")) {
			System.setProperty("webdriver.chrome.driver", "./browser_exe/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "./browser_exe/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


}
