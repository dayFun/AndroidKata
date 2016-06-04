package com.lighthouse.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lighthouse.recyclerview.R;
import com.lighthouse.recyclerview.model.ListItem;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<ListItem> data;
    private LayoutInflater inflater;

    public MyAdapter(List<ListItem> data, Context context) {
        this.data = data;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ListItem item = data.get(position);
        holder.setTitle(item.getTitle());
        holder.setIcon(item.getIconId());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
