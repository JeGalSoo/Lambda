package com.turing.api;


import com.turing.api.enums.Menus;

import java.util.Scanner;

public class Main {
    public static class main {
        private static final Scanner sc = new Scanner(System.in);
        public static void main(String[] args){
            while(Menus.getOperator(sc));
        }
    }
}