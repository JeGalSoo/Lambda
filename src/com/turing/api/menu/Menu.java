package com.turing.api.menu;

import lombok.*;

@Getter
@NoArgsConstructor
@ToString
public class Menu {
    private Long id;
    private String item;
    private String category; //테이블명

    public Menu(Long id, String item, String category) {
        this.id = id;
        this.item = item;
        this.category = category;
    }
}
