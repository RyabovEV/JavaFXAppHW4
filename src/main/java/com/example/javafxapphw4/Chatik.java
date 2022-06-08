package com.example.javafxapphw4;

import java.util.ArrayList;
import java.util.List;

public class Chatik {
    List<String> list;

    public Chatik() {
        this.list = new ArrayList<>();
    }

    public void addList(String list) {
        this.list.add(list);
    }

    @Override
    public String toString() {
        String str = "";
        for (String a : list) {
            str += a + '\n';
        }
        return str;
    }
}
