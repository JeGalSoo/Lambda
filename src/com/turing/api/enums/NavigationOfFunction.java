package com.turing.api.enums;

import com.turing.api.account.AccountView;
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
    review("r", i -> {
        ReViewRouter.select(i);
        return "true";
    }),
    account("a", i -> {
        while(AccountView.main(i));
        return "true";
    }),
    crawler("c", i -> {
        while(true) {
            if (!CrawlerRouter.select(i)) break;
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