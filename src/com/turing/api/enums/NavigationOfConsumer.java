package com.turing.api.enums;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public enum NavigationOfConsumer {
    user("u", i -> {
        while(UserRouterPredicate.getOperator(i));
        return ;
    }),
    exit("x", i->{return ;})
    ;
    private final String menu;
    private final Consumer<Scanner> consumer;

    NavigationOfConsumer(String menu, Consumer<Scanner> consumer) {
        this.menu = menu;
        this.consumer = consumer;
    }

    public static void select(Scanner sc) {
        String a = sc.next();
        while (true) {
            Arrays.stream(values())
                    .filter(i -> i.menu.equals(a))
                    .findFirst().orElseThrow(() -> new IllegalArgumentException("error"))
                    .consumer.accept(sc);
            return;
        }
    }
}
