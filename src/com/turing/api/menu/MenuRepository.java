package com.turing.api.menu;

import com.mysql.cj.protocol.Resultset;
import com.turing.api.user.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuRepository {
    private static List<Menu> list;
    private static MenuRepository instance;

    static {
        try {
            instance = new MenuRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private PreparedStatement pstmt;
    private ResultSet rs;

    Connection connection;

    private MenuRepository() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/turingdb",
                "turing",
                "password");
        pstmt = null;
        rs = null;
        list = new ArrayList<>();
    } //디폴트 생성자를 막음 / 단 앞에 맵 선언 필요

    public static MenuRepository getInstance() {
        return instance;
    }

    public String menu(Menu menu) throws SQLException {
        String sql = "select distinct " + menu.getItem()+" from " + menu.getCategory();
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        String categorym="";
        if (rs.next()) {
            do {

                        categorym+=rs.getString(menu.getItem())+"\n";
            } while (rs.next());
        } else {
            System.out.println("데이터 없음");
        }
        pstmt.close();
        return categorym;
    }

    public void insertMenu(Menu build) throws SQLException {
        String sql = "insert into menus (category,item) values (?,?)";
        PreparedStatement pstmt=connection.prepareStatement(sql);
        pstmt.setString(1,build.getCategory());
        pstmt.setString(2,build.getItem());
        pstmt.executeUpdate();
    }

    public void makeMenu() throws SQLException {
        String sql="create table menus(id INT AUTO_INCREMENT PRIMARY KEY, " +
                "category varchar(20), item varchar(20));";
        pstmt=connection.prepareStatement(sql);
        pstmt.executeUpdate();
    }
}