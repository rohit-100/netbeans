package jsouptesting;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class JsoupTesting {

    public static final String BASE = "https://www.codechef.com/users/";
    public static void main(String[] args) throws IOException {

        String username = "gvshukla321";
        String url = BASE+username;
        Document doc = Jsoup.connect(url).get();
        

//        Elements element = doc.getElementsByTag("a");
//        
//        for(Element link :element)
//        {
//            String hrefLink = link.attr("href");
//            System.out.println(hrefLink);
//        }
        //        Elements elements = doc.getElementsByClass("content");
        //        for(Element link :elements)
        //        {
        //            System.out.println(link.text());
        //        }
//           Elements elements = doc.getElementsByClass("content");
//           for(Element link : elements)
//           {
//               System.out.println(link.text());
//           }
         //System.out.println(doc.getElementsByClass("inline-list"));
         System.out.println(doc.getElementsByClass("rating-number").text());
        System.out.println(doc.getElementsByClass("rating-ranks").text());
        ArrayList<question> nodes = new ArrayList<>();
        ArrayList<String> gg;
        gg=new ArrayList<>();
        ArrayList<String> qs;
        qs = new ArrayList<>();
        Elements links = doc.select("a[href]");
        links.stream().filter((link) -> (link.attr("href").contains(username) && link.attr("href").contains("status"))).forEachOrdered((link) -> {
            qs.add(link.attr("href"));
            //System.out.println(link.attr("href"));
            gg.add(link.text());
        });
        //for(String str:qs)
          //filter(str); 
           // System.out.println(str);
        //System.out.println(qs.size());
        for(String text:gg)
            for(String hh:qs)
            {
                if(hh.contains(text))
                    nodes.add(new question(text, hh));
            }
        for(question pp:nodes)
           filter(pp);
           // System.out.println(pp.question +"   "+pp.link);
       
        
    }
    
   public static void filter(question ques) throws IOException
   {
       String url = ques.link;
       //System.out.println(url);
       Document document = Jsoup.connect("https://www.codechef.com"+url).get();
       ArrayList<String> qs,gg;
       qs = new ArrayList<>();
       gg = new ArrayList<>();
       Elements links = document.select("a[href]");
       links.stream().filter((link) -> (link.attr("href").contains(ques.question) && link.attr("href").contains("problems"))).forEachOrdered((link) -> {
            qs.add(link.attr("href"));
            //System.out.println(link.attr("href"));
            //gg.add(link.text());
        });
       
       for(int i=0;i<qs.size();i+=2)gg.add("https://www.codechef.com"+qs.get(i));
       for(String str:gg)System.out.println(str);
       
       
       
       
       
       
   }
    
    
    
    
    
    
    
    

}
