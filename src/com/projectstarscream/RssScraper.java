package com.projectstarscream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class RssScraper {

   private final String url = "https://thenextweb.com/latest/";
   private final String titleSelector = ".story-title";
   private final String classSelector = ".story-chunk";
   private final String imageSelector = "div a, .story-image style"; // not working, needs css parser
   private final String attrSelector = "href";



    public void displayPosts() throws IOException {

    Document doc = Jsoup.connect(url).get();
    //Parses post title
    Elements titles = doc.select(titleSelector);
    List<String> titleText = titles.eachText();
    //Parses post images
    //TODO CSS third-party parser
    Elements images = doc.select(imageSelector);
    List<String> postImage = images.eachAttr("background-image");
    //Parses post summary
    Elements summaries = doc.select(classSelector);
    List<String> postSummary = summaries.eachText();
    //Parses post [embedded] link
    Elements titleLink = titles.select("a");
    List<String> relativeLink = titleLink.eachAttr(attrSelector);

    for (int i = 0; i < titleText.size(); i++) {
        System.out.println(postImage.get(i));
        System.out.println(titleText.get(i));
        System.out.println(postSummary.get(i));
        System.out.println(relativeLink.get(i));
        System.out.println("");
    }


    }


}
