package de.vedantwankha.java.liang.io;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WebCrawlerTest {

    @Test
    void crawl() {
        try {
            WebCrawler crawler = new WebCrawler();
//            crawler.crawl("https://www.google.com");
            crawler.crawl("https://en.wikipedia.org/wiki/Main_Page");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}