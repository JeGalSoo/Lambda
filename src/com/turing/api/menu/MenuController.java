package com.turing.api.menu;

import java.sql.SQLException;

public class MenuController {
    private static MenuController instance = new MenuController();
   static MenuServiceImpl ms;

    private MenuController(){
        ms=MenuServiceImpl.getInstance();
    } //디폴트 생성자를 막음 / 단 앞에 맵 선언 필요

    public static MenuController getInstance() {
        return instance;
    }
    public static String munu(String sc) throws SQLException {
        return MenuServiceImpl.menu(Menu.builder()
                        .category(sc)
                .build());
    }
}
