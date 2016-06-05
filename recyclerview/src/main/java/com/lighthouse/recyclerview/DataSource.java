package com.lighthouse.recyclerview;

import java.util.Arrays;
import java.util.List;

public class DataSource {

    public static List<Model> getData() {
        return Arrays.asList(new Model("Joe", "joe@gmail.com"),
                new Model("Tom", "Tom@gmail.com"),
                new Model("Henry", "henry@gmail.com"),
                new Model("Danae", "danae@gmail.com"),
                new Model("Joy", "joy@gmail.com"),
                new Model("Dan", "dan@gmail.com"));
    }
}
