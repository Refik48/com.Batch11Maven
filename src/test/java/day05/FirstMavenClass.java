package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.KeyFactorySpi;
import java.util.List;

public class FirstMavenClass {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Class Work Amazon Search Test
        //1- https://www.amazon.com/ sayfasina gidelim
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");


       // 2- arama kutusunu locate edelim

        WebElement searchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));



       // 3- “Samsung headphones” ile arama yapalim

        String arananKelime ="samsung headphones";
        searchBox.sendKeys(arananKelime);
        searchBox.submit();

        //4- Bulunan sonuc sayisini yazdiralim
       WebElement sonucSayisi=driver.findElement(By.xpath("(//span[@dir='auto'])[1]"));
        System.out.println(sonucSayisi.getText());

       // 5- Ilk urunu tiklayalim

           driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
           driver.navigate().back();
       // 6- Sayfadaki tum basliklari yazdiralim
        List<WebElement> baslikListesi = driver.findElements(By.xpath("(//span[@dir='auto'])"));
        for (WebElement w : baslikListesi
        ) {
            System.out.println(w.getText());
        }
        driver.close();
    }
}
