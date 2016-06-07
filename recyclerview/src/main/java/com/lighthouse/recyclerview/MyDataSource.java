package com.lighthouse.recyclerview;

import java.util.Arrays;
import java.util.List;

public class MyDataSource {

    public static List<ItemModel> getData() {
        return Arrays.asList(new ItemModel(), new ItemModel(), new ItemModel(),
                             new ItemModel(), new ItemModel(), new ItemModel(),
                             new ItemModel(), new ItemModel(), new ItemModel());
    }
}
