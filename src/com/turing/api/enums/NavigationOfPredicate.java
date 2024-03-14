package com.turing.api.enums;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public enum NavigationOfPredicate {
    user("u", i -> {
        while(UserRouterPredicate.getOperator(i));
        return true;
    }),
    exit("x", i->{return false;})
    ;
    private final String menu;
    private final Predicate<Scanner> predicate;

    NavigationOfPredicate(String menu, Predicate<Scanner> predicate) {
        this.menu = menu;
        this.predicate = predicate;
    }

    public static Boolean select(Scanner sc) {
        String a = sc.next();
        while (true) {
            return Arrays.stream(values())
                    .filter(i -> i.menu.equals(a))
                    .findFirst().orElseThrow(() -> new IllegalArgumentException("error"))
                    .predicate.test(sc);
        }
    }
}
