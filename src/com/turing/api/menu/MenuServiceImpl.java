package com.turing.api.menu;

import java.sql.SQLException;
import java.util.List;

public class MenuServiceImpl implements MenuService {
    private static MenuRepository mr;
    private static MenuServiceImpl instance = new MenuServiceImpl();


    private MenuServiceImpl() {
        mr = MenuRepository.getInstance();
    } //디폴트 생성자를 막음 / 단 앞에 맵 선언 필요

    public static MenuServiceImpl getInstance() {
        return instance;
    }




@Override
    public void insertMenus() throws SQLException {
        String[] categories = {"navigate", "user", "account", "article", "board", "soccer"};
        String[][] menus = {{"x", "usr", "acc", "cwl", "art", "bbs", "scc"},
                {"x", "mk", "joi", "log", "cat :", "ch-pw", "rm",
                        "ls-a", "ls-n", "ls-job", "cnt"},
                {"x", "mk", "touch", "with", "depo", "bal", "rm", "cat", "ls-a"},
                {"x", "mk"},
                {"x", "mk"},
                {"x", "mk"},
        };

        for (int i = 0; i < menus.length; i++)
            for (int j = 0; j < menus[i].length; j++)
                mr.insertMenu(Menu.builder().category(categories[i]).item(menus[i][j]).build());


    }

    @Override
    public void makeMenus() throws SQLException {
        mr.makeMenu();
    }
    @Override
    public String menu(Menu sc) throws SQLException {
        return mr.menu(sc);
    }
}
