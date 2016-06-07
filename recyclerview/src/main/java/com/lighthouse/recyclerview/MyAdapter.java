package com.lighthouse.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<ItemModel> data = MyDataSource.getData();
    private Context context;
    private LayoutInflater inflater;

    public MyAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_model_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.setIdText(data.get(position).getId());
        holder.setNumber(data.get(position).getNumber());
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView id;
        private TextView number;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.id = (TextView) itemView.findViewById(R.id.id_string);
            this.number = (TextView) itemView.findViewById(R.id.number_string);
        }

        public void setIdText(String text) {
            id.setText(text);
        }

        public void setNumber(int numText) {
            number.setText(numText + "");
        }
    }
}
