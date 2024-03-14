package com.turing.api.menu;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuRouter {
    public static boolean main(String sc) throws SQLException {
        System.out.println(MenuController.munu(sc));
        return true;
    }
}
