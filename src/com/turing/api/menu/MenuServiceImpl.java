package com.turing.api.menu;

import java.sql.SQLException;
import java.util.List;

public class MenuServiceImpl {
    private static MenuRepository mr;
    private static MenuServiceImpl instance = new MenuServiceImpl();


    private MenuServiceImpl(){
        mr=MenuRepository.getInstance();
    } //디폴트 생성자를 막음 / 단 앞에 맵 선언 필요

    public static MenuServiceImpl getInstance() {
        return instance;
    }


    public static String menu(Menu menu) throws SQLException {
        return mr.menu(menu);
    }
}
