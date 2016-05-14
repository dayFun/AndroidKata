package com.lighthouse.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder> {

    private final LayoutInflater inflater;
    private List<RecyclerViewRow> rows;

    public MyRecyclerViewAdapter(Context context, List<RecyclerViewRow> rows) {
        this.inflater = LayoutInflater.from(context);
        this.rows = rows;
    }

    @Override
    public MyRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recyclerview_row, parent, false);

        MyRecyclerViewHolder viewHolder = new MyRecyclerViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(MyRecyclerViewHolder holder, int position) {
        RecyclerViewRow current = rows.get(position);
        holder.getRowTextView().setText(current.getTitle());
        holder.getRowImageView().setImageResource(current.getIconId());
    }

    @Override
    public int getItemCount() {
        return rows.size();
    }
}
