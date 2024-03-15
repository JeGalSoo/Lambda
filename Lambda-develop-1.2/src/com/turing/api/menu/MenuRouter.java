package com.turing.api.menu;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuRouter {
    public static boolean main() throws SQLException {
        MenuController.makeMenus();
       MenuController.insertMenus();
//        System.out.println(MenuController.munu(sc));
        return false;
    }
}
