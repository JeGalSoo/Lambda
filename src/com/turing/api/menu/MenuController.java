package com.turing.api.menu;

import java.sql.SQLException;

public class MenuController {
    private static MenuController instance = new MenuController();
   static MenuService ms;

    private MenuController(){
        ms=MenuServiceImpl.getInstance();
    } //디폴트 생성자를 막음 / 단 앞에 맵 선언 필요

    public static MenuController getInstance() {
        return instance;
    }
    public static String munu(String sc,String sc2) throws SQLException {
        return ms.menu(Menu.builder()
                        .item(sc2)//컬럼
                        .category(sc) //테이블
                .build());
    }

    public static boolean insertMenus() throws SQLException {
        ms.insertMenus();
        return false;
    }

    public static void makeMenus() throws SQLException {
        ms.makeMenus();
    }
}
