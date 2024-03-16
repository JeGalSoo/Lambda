package com.turing.api.crawler;

import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CrawlerController {
    private static CrawlerController instance = new CrawlerController();

    private CrawlerController(){
    } //디폴트 생성자를 막음 / 단 앞에 맵 선언 필요

    public static CrawlerController getInstance() {
        return instance;
    }
    private static CrawlerServiceImpl service = CrawlerServiceImpl.getInstance();
    public static Map<String,?> findBugsMusic(Scanner scanner) throws IOException {
        System.out.println("크롤링할 주소를 입력하시오.");
        String url = scanner.next();
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("URL", url);

        return service.findNamesFromWeb(paramMap);
    }
}
