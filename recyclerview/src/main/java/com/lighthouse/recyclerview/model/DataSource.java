package com.lighthouse.recyclerview.model;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<ListItem> getData() {

        List<ListItem> data = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            ListItem item = new ListItem("Title " + i, android.R.drawable.ic_dialog_email);
            data.add(item);
        }

        return data;
    }
}
