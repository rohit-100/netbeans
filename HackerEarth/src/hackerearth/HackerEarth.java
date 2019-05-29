
package hackerearth;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HackerEarth {

    
    public static void main(String[] args) throws IOException {
        
        String url = "https://www.hackerearth.com/@rohit1313";
        Document doc = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36")
                .referrer("http://www.google.com").ignoreHttpErrors(true).get();
        
        //Elements ele = doc.getElementsByClass("regular dark");
        System.out.println(doc.text());
 
        
        
        
        
        
        
        
    }
    
}
