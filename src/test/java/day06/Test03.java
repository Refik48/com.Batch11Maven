package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test03 {
    public static void main(String[] args) {
        //1. “https://www.saucedemo.com” Adresine gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
       // 2. Username kutusuna “standard_user” yazdirin


        //3. Password kutusuna “secret_sauce” yazdirin

       // 4. Login tusuna basin


      //  5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin


       // 6. Add to Cart butonuna basin


      //  7. Alisveris sepetine tiklayin


      //  8. Sectiginiz urunun basarili olarak sepete eklendigini control edin


      //  9. Sayfayi kapatin
    }
}
