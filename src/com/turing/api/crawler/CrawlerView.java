package com.turing.api.crawler;

import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CrawlerView {
//    public static boolean main(Scanner scanner) throws IOException {
//        CrawlerController controller = new CrawlerController();
//        while(true){
//            System.out.println("[사용자메뉴] 0-종료\n " +
//                    "1-벅스뮤직\n " +
//                    "2-로그인\n " +
//                    "3-ID검색\n " +
//                    "4-비번변경\n" +
//                    "5-탈퇴\n " +
//                    "6-회원목록\n " +
//                    "7-이름검색\n" +
//                    "8-직업검색\n" +
//                    "9-회원수");
//            switch (scanner.next()){
//                case "0":
//                    System.out.println("종료");
//                    return false;
//                case "1":
//                    System.out.println("1-벅스뮤직");
//                    Map<String, ?> map = controller.findBugsMusic(scanner);
//                    Iterator<Element> rank = (Iterator<Element>) map.get("rank");
//                    Iterator<Element> artist = (Iterator<Element>) map.get("artist");
//                    Iterator<Element> title = (Iterator<Element>) map.get("title");
//
//                    System.out.println("벅스뮤직 결과 : ");
//                    while(rank.hasNext()){
//                        System.out.println(rank.next().text() + "위 " + artist.next().text() + " - " + title.next().text());
//                    }
//                    break;
//                case "2":
//                    System.out.println("2-로그인");
//
//                    System.out.println("로그인 결과 : ");
//                    break;
//                case "3":
//                    System.out.println("3-ID 검색");
//
//                    break;
//                case "4":
//                    System.out.println("4-비번변경");
//
//                    break;
//                case "5":
//                    System.out.println("5-탈퇴");
//
//                    break;
//                case "6":
//                    System.out.println("6-회원목록");
//
//                    break;
//                case "7":
//                    System.out.println("7-이름검색");
//
//                    break;
//                case "8":
//                    System.out.println("8-직업검색");
//
//                    break;
//                case "9":
//                    System.out.println("9-회원수");
//
//
//                    break;
//
//
//            }
//
//        }
//
//    }
}
