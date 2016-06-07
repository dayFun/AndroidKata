package com.lighthouse.recyclerview;

import java.util.Random;
import java.util.UUID;

public class ItemModel {

    private String id;
    private int number;

    public ItemModel() {
        this.id = UUID.randomUUID().toString();
        this.number = new Random().nextInt();
    }

    public String getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }
}
