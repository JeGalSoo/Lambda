package com.turing.api;


import com.turing.api.enums.NavigationOfConsumer;
import com.turing.api.enums.NavigationOfFunction;
import com.turing.api.enums.NavigationOfPredicate;
import com.turing.api.enums.NavigationOfSupplier;

import java.util.Scanner;

public class Main {
    public static class main {
        private static final Scanner sc = new Scanner(System.in);
        public static void main(String[] args){
            NavigationOfConsumer.select(sc);
            while(Boolean.parseBoolean(NavigationOfFunction.select(sc)));
            while(Boolean.parseBoolean(NavigationOfSupplier.select()));
            while(NavigationOfPredicate.select(sc));
        }
    }
}