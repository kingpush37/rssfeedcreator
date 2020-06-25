package com.projectstarscream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class RssScraper {

    String url = "https://thenextweb.com/latest/";


    //TODO handle IOException
    public void displayTitle() throws IOException {

    Document doc = Jsoup.connect(url).get();

    Elements titles = doc.select(".story-title");
    String titleText = titles.text();
    Elements titleLink = titles.select("a");

      // for (Element title : titles)
            System.out.println(titleLink);
    }


}
