package com.turing.api.menu;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface MenuService {

    void makeMenus() throws SQLException;

     String menu(Menu sc) throws SQLException;

    void insertMenus() throws SQLException;

}
