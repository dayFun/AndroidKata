package com.lighthouse.recyclerview;

public class RecyclerViewRow {

    private int iconId;
    private String title;

    public RecyclerViewRow(int iconId, String title) {
        this.iconId = iconId;
        this.title = title;
    }

    public int getIconId() {
        return iconId;
    }

    public String getTitle() {
        return title;
    }
}
