package com.turing.api.review;

import java.sql.SQLException;
import java.util.List;

public class ReViewController {
    private static ReViewController instance = new ReViewController();
    private ReViewController(){
        this.rs=ReViewServiceImpl.getInstance();
    } //디폴트 생성자를 막음 / 단 앞에 맵 선언 필요

    public static ReViewController getInstance() {
        return instance;
    }
    private static ReViewServiceImpl rs;


    public static List<?> showall() throws SQLException {
        return rs.showall();
    }



    }
