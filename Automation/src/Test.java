
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import au.com.bytecode.opencsv.CSVReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.*; 




public class Test {


	public static void main(String[] args) throws InterruptedException, IOException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("appium:deviceName", "deviceName");
		capabilities.setCapability("appium:app", "src/nopstationCart_4.40.apk");
		String path = "src/test.csv";
		String line = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line=br.readLine())!=null) {
				String[] values = line.split(",");
				System.out.println("Script has started");
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();

		}catch(IOException e) {
			e.printStackTrace();
		}

		System.out.println("Scene : 01");



		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,capabilities);

		//  capabilities.setCapability("appPackage","com.nopstation.nopcommerce.nopstationcart");
		//  capabilities.setCapability("appActivity","com.nopstation.nopcommerce.nopstationcart.Automation");
		Thread.sleep(5000);

		driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/btnAccept")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Category\"]/android.view.ViewGroup/android.widget.TextView")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.TextView")).click();


		Thread.sleep(5000);


		new TouchAction(driver).press(PointOption.point(538, 1978)).waitAction().moveTo(PointOption.point(550, 500)).release().perform();




		Thread.sleep(1000);
		new TouchAction(driver).press(PointOption.point(538, 1978)).waitAction().moveTo(PointOption.point(550, 1600)).release().perform();
		Thread.sleep(1000);
		//new TouchAction(driver).press(PointOption.point(538, 1978)).waitAction().moveTo(PointOption.point(550, 1500)).release().perform();


		Thread.sleep(5000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup")).click();
		Thread.sleep(5000);

		new TouchAction(driver).press(PointOption.point(504, 1699)).waitAction().moveTo(PointOption.point(521, 900)).release().perform();

		Thread.sleep(5000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup[1]/android.widget.TextView[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup[2]/android.widget.TextView[3]")).click();
		//driver.quit();
		Thread.sleep(1000);
		driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/btnPlus")).click();

		Thread.sleep(5000);
		driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart")).click();

		Thread.sleep(5000);
		System.out.println("Scene Complete");
		System.out.println("Scene : 02");

		driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/counterText")).click();

		Thread.sleep(5000);

		driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut")).click();

		Thread.sleep(5000);

		driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")).click();

		Thread.sleep(5000);
		Thread.sleep(5000);
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line=br.readLine())!=null) {
				String[] values = line.split(",");
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName")).click();
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName")).sendKeys(values[0]);
				Thread.sleep(1000);
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName")).click();
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName")).sendKeys(values[1]);
				Thread.sleep(1000);
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail")).click();
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail")).sendKeys(values[2]);
				Thread.sleep(1000);

				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinner")).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]")).click();
				Thread.sleep(1000);
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/stateSpinner")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
				Thread.sleep(1000);




				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName")).click();
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName")).sendKeys(values[4]);
				Thread.sleep(1000);

				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etCity")).click();
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etCity")).sendKeys(values[4]);

				Thread.sleep(1000);
				new TouchAction(driver).press(PointOption.point(538, 1978)).waitAction().moveTo(PointOption.point(550, 500)).release().perform();
				Thread.sleep(1000);
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")).click();
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")).sendKeys(values[4]);
				Thread.sleep(1000);

				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode")).click();
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode")).sendKeys(values[5]);

				Thread.sleep(1000);
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone")).click();
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone")).sendKeys(values[5]);
				Thread.sleep(1000);

				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etFax")).click();
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/etFax")).sendKeys(values[5]);

				Thread.sleep(1000);
				driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue")).click();

				Thread.sleep(5000);


			}

		}catch(FileNotFoundException e) {
			e.printStackTrace();

		}catch(IOException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial/android.widget.RelativeLayout[3]/android.widget.TextView[1]")).click();
		Thread.sleep(1000);
		new TouchAction(driver).press(PointOption.point(538, 1978)).waitAction().moveTo(PointOption.point(550, 500)).release().perform();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")).click();
		Thread.sleep(5000);
		new TouchAction(driver).press(PointOption.point(538, 1978)).waitAction().moveTo(PointOption.point(550, 500)).release().perform();
		new TouchAction(driver).press(PointOption.point(538, 1978)).waitAction().moveTo(PointOption.point(550, 500)).release().perform();
		new TouchAction(driver).press(PointOption.point(538, 1978)).waitAction().moveTo(PointOption.point(550, 500)).release().perform();

		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")).click();
		Thread.sleep(5000);





		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button")).click();
		Thread.sleep(5000);

		//  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView")).click();
		//  Thread.sleep(5000);

		//com.nopstation.nopcommerce.nopstationcart:id/paymentInfoWebView
		driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue")).click();
		
		Thread.sleep(5000);
		WebElement element = (WebElement) driver.findElement(ById.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message"));
		String elText = element.getText();
		System.out.println(element);
		
		System.out.println("Scene Complete");

		//read com.nopstation.nopcommerce.nopstationcart:id/md_text_message

	}
	//test


	private static Reader getReader(String string) {
		// TODO Auto-generated method stub
		return null;
	}



	private static Object TouchAction() {
		// TODO Auto-generated method stub
		return null;
	}
}
