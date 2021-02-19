package day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BestBuyAssertions {
//    1) Bir class oluşturun: BestBuyAssertions
//    2) https://www.bestbuy.com/ Adresine gidin
//    farkli test method’lari olusturarak asagidaki testleri yapin
//            ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
//            ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
//            ○ logoTest => BestBuy logosunun görüntülendigini test edin
//            ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

 static WebDriver driver;
   @BeforeClass
   public static void setUP(){
       WebDriverManager.chromedriver().setup();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       driver.manage().window().maximize();

   }











}
