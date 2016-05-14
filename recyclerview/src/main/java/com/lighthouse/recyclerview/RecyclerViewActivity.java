package com.lighthouse.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<RecyclerViewRow> rows = Arrays.asList(new RecyclerViewRow(android.R.drawable.ic_dialog_email, "Some Text"),
            new RecyclerViewRow(android.R.drawable.ic_dialog_email, "Some Text"),
            new RecyclerViewRow(android.R.drawable.ic_dialog_email, "Some Text"),
            new RecyclerViewRow(android.R.drawable.ic_dialog_email, "Some Text"),
            new RecyclerViewRow(android.R.drawable.ic_dialog_email, "Some Text"),
            new RecyclerViewRow(android.R.drawable.ic_dialog_email, "Some Text"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new MyRecyclerViewAdapter(this, rows));

    }
}
