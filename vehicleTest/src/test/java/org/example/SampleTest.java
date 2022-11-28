
package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SampleTest {

    public AppiumDriver<WebElement> driver;
    public WebDriverWait wait;

    By conButton = By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/adminButton");
    By addButton = By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/adminAddButton");
    By aracBilgi = By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/addVehicleModelEditText");
    By plakaBilgi = By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/addVehicleLicensePlateEditText");
    By saglikBilgi= By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/addVehicleHealthEditText");
    By beygirBilgi= By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/addVehiclePowerEditText");
    By vitesTipi= By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/addVehicleGearTypeEditText");
    By kacKisi= By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/addVehicleHowManyPersonEditText");
    By ucret = By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/addVehicleDailyPriceEditText");
    By aracFoto=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/addVehicleImage");
    By telFoto= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout");
    By sonFoto= By.xpath("(//android.view.ViewGroup[@content-desc=\"Photo taken on Nov 28, 2022 9:25:46 PM\"])[3]");
    By kaydetBtn= By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/vehicleSaveButton");

    By mKayit= By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/customerSignUpButton");
    By mAd= By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/customerSignUpNameEditText");
    By mSoyad= By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/customerSignUpSurnameEditText");
    By tcNo = By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/customerSignUpPhoneNumberEditText");
    By ehliyetFoto=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/addDrivingLicenseButton");
    By ehliyetTel=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout");
    By ehliyetSon=By.xpath("(//android.view.ViewGroup[@content-desc=\"Photo taken on Nov 28, 2022 9:25:46 PM\"])[2]");
    By tcFoto=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/addIdentityButton");
    By tcTel=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout");
    By tcSon = By.xpath("(//android.view.ViewGroup[@content-desc=\"Photo taken on Nov 28, 2022 9:25:46 PM\"])[1]");
    By getmKayitSon=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/customerCompleteSignUpButton");
    By mLoginBtn=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/customerLogInButton");
    By aracSecBtn=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/pickVehicleButton");
    By startDate=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/rentStartDate");
    By endDate=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/editTextDate2");
    By ofisAd=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/rentOffice");
    By devamBtn=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/rentButton");
    By kartNo=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/paymentCardNumberEditText");
    By lastMont=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/paymentCardLastDateMonthEditText");
    By lastYear=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/paymentCardLastDateYearEditText");
    By cvv=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/paymentCardCVVEditText");
    By checkBox= By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/paymentCheckBox");
    By sonBtn=By.id("com.irempamukcu.vehicleregistrationandselectionproject:id/paymentCompleteButton");




    @BeforeTest
    public void beforeTest(){

        try {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("appium:devicesName", "Pixel 4 API 31");
            cap.setCapability("platformName", "Android");
            cap.setCapability("appium:platformVersion", "11");
            cap.setCapability("appium:udid", "emulator-5556");
            cap.setCapability("appium:appPackage", "com.irempamukcu.vehicleregistrationandselectionproject");
            cap.setCapability("appium:appActivity", "com.irempamukcu.vehicleregistrationandselectionproject.MainActivity");


            driver= new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            wait =new WebDriverWait(driver, 10);
        }
        catch (MalformedURLException ux){
            System.out.println("URL hatası");
        }
    }

    @Test
    public void test(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement conSelect = driver.findElement(conButton);
        conSelect.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement conSelect2 = driver.findElement(addButton);
        conSelect2.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect3 = driver.findElement(aracBilgi);
        conSelect3.sendKeys("2002");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect4 = driver.findElement(plakaBilgi);
        conSelect4.sendKeys("34 ABC 123");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect5 = driver.findElement(saglikBilgi);
        conSelect5.sendKeys("iyi");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect6= driver.findElement(beygirBilgi);
        conSelect6.sendKeys("100");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect7 = driver.findElement(vitesTipi);
        conSelect7.sendKeys("otomatik");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect8= driver.findElement(kacKisi);
        conSelect8.sendKeys("4");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect9 = driver.findElement(ucret);
        conSelect9.sendKeys("150");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect10= driver.findElement(aracFoto);
        conSelect10.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect11= driver.findElement(telFoto);
        conSelect11.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect12= driver.findElement(sonFoto);
        conSelect12.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect13 = driver.findElement(kaydetBtn);
        conSelect13.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        for (int i=0;i<3;i++){
            driver.navigate().back();
        }

        WebElement conSelect14 = driver.findElement(mKayit);
        conSelect14.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect15 =driver.findElement(mAd);
        conSelect15.sendKeys("Furkan");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect16 =driver.findElement(mSoyad);
        conSelect16.sendKeys("Demir");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect17 =driver.findElement(tcNo);
        conSelect17.sendKeys("5006005040");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect18 = driver.findElement(ehliyetFoto);
        conSelect18.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect19 = driver.findElement(ehliyetTel);
        conSelect19.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect20 = driver.findElement(ehliyetSon);
        conSelect20.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


        WebElement conSelect22 = driver.findElement(tcFoto);
        conSelect22.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect23 = driver.findElement(tcTel);
        conSelect23.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect24 = driver.findElement(tcSon);
        conSelect24.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect25= driver.findElement(getmKayitSon);
        conSelect25.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebElement conSelect26 =driver.findElement(mLoginBtn);
        conSelect26.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect27 =driver.findElement(aracSecBtn);
        conSelect27.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect28 =driver.findElement(startDate);
        conSelect28.sendKeys("01/06");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect29 =driver.findElement(endDate);
        conSelect29.sendKeys("04/06");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect30 =driver.findElement(ofisAd);
        conSelect30.sendKeys("Beylikdüzü");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect31=driver.findElement(devamBtn);
        conSelect31.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect32 =driver.findElement(kartNo);
        conSelect32.sendKeys("1111222233334444");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect33 =driver.findElement(lastMont);
        conSelect33.sendKeys("04");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect34 =driver.findElement(lastYear);
        conSelect34.sendKeys("2026");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect35 =driver.findElement(cvv);
        conSelect35.sendKeys("321");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement conSelect36 =driver.findElement(checkBox);
        conSelect36.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebElement conSelect37 =driver.findElement(sonBtn);
        conSelect37.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);






















    }

    @AfterTest
    public void tearDown(){

    }

}
