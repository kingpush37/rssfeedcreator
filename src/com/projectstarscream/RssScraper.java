package com.projectstarscream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class RssScraper {

    Document doc = Jsoup.connect("https://www.feedspot.com/?_src=folder").get();

    //TODO handle IOException
    public RssScraper() throws IOException {
    }

    void displayRequest() {
        System.out.println(doc);
    }
}
