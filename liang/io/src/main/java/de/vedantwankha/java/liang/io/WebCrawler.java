package de.vedantwankha.java.liang.io;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class WebCrawler {
    private final Set<String> crawledUrls = new HashSet<>();
    private final Deque<String> pendingUrls = new ArrayDeque<>();

    public void crawl(String s) throws IOException {
        pendingUrls.add(s);
        while (crawledUrls.size() != 20 && !pendingUrls.isEmpty()) {
            String currentUrl = pendingUrls.pollFirst();
            if (!crawledUrls.contains(currentUrl)) {
                System.out.println("Crawl: " + currentUrl);
                crawledUrls.add(currentUrl);
                pendingUrls.remove(currentUrl);
                pendingUrls.addAll(getSubLinks(currentUrl));
            }
        }
    }

    private List<String> getSubLinks(String s) throws IOException {
        URL url = new URL(s);
        Scanner sc = new Scanner(url.openStream());
        List<String> subLinks = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            int idx = line.indexOf("https://");
            if (idx >= 0) {
                int endIdx = line.indexOf("\"", idx);
                if (endIdx >= 0) {
                    String link = line.substring(idx, endIdx);
                    if (!this.crawledUrls.contains(link)) {
                        subLinks.add(link);
                    }
                }
            }
        }
        return subLinks;
    }
}
