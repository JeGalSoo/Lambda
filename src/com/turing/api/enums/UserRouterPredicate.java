package com.turing.api.enums;

import com.turing.api.menu.MenuController;
import com.turing.api.user.UserController;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public enum UserRouterPredicate {
    exit("e",i-> {
        return false;
    }),
    find_id("f",i-> {
        try {
            System.out.println(UserController.getInstance().findUsername(i));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }),
    count("q",i-> {
        try {
            System.out.println(UserController.getInstance().count());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }),
    save("s",i-> {
        try {
            System.out.println(UserController.getInstance().save1(i));
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }),
    login("l",i-> {
        try {
            System.out.println(UserController.getInstance().login(i));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }),
    touch("t",i-> {
        try {
            System.out.println(UserController.getInstance().touch());
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }),
    rm("r",i-> {
        try {
            System.out.println(UserController.getInstance().rm());
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }),
    cat("c",i-> {
        try {
            System.out.println(UserController.getInstance().cat());
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    })
    ;
    private final String num;
    private final Function<Scanner, Boolean> function;

    UserRouterPredicate(String num, Function<Scanner,Boolean> predicate) {
        this.num = num;
        this.function = predicate;
    }
    public static boolean getOperator(Scanner sc) throws SQLException {
        System.out.println(MenuController.munu("menus"));;
        String a=sc.next();
            return Arrays.stream(values())
                    .filter(i -> i.num.equals(a))
                    .findAny().orElseThrow(() -> new IllegalArgumentException("error"))
                    .function.apply(sc);
    }
}
