package com.lighthouse.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView rowTextView;
    private ImageView rowImageView;

    public MyRecyclerViewHolder(View itemView) {
        super(itemView);
        rowImageView = (ImageView) itemView.findViewById(R.id.row_icon);
        rowTextView = (TextView) itemView.findViewById(R.id.row_text);
    }

    public TextView getRowTextView() {
        return rowTextView;
    }

    public ImageView getRowImageView() {
        return rowImageView;
    }
}
