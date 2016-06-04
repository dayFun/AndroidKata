package com.lighthouse.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lighthouse.recyclerview.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private ImageView icon;

    public MyViewHolder(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.item_text);
        icon = (ImageView) itemView.findViewById(R.id.item_icon);
    }

    public TextView getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title.setText(title);
    }

    public ImageView getIcon() {
        return icon;
    }

    public void setIcon(int iconId) {
        icon.setImageResource(iconId);
    }
}
