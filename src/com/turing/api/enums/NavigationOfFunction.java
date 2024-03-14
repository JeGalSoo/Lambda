package com.turing.api.enums;

import com.turing.api.account.Account;
import com.turing.api.account.AccountView;
import com.turing.api.board.BoardView;
import com.turing.api.crawler.CrawlerView;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public enum NavigationOfFunction {
    user("u", i -> {
        while(UserRouterPredicate.getOperator(i));
        return "True";
    }),
//    board("b", i -> {
//        while(BoardView.main());
//        return "true";
//    }),
    account("a", i -> {
        while(AccountView.main(i));
        return "true";
    }),
    crawler("c", i -> {
        while(true) {
            try {
                if (!CrawlerView.main(i)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            ;
        }
        return "true";
    }),
    exit("x", i->{return "False";})
    ;
    private final String menu;
    private final Function<Scanner,String> function;

    NavigationOfFunction(String menu, Function<Scanner,String> function) {
        this.menu = menu;
        this.function = function;
    }
    public static String select(Scanner sc) {
        String a = sc.next();
        while (true) {
            return Arrays.stream(values())
                    .filter(i -> i.menu.equals(a))
                    .findFirst().orElseThrow(() -> new IllegalArgumentException("error"))
                    .function.apply(sc);
        }
    }
}