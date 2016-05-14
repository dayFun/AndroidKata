package com.lighthouse.androidkata;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentPage extends Fragment{

    private int pageNum;

    public FragmentPage() {
    }

    public static FragmentPage create(int position) {
        FragmentPage fragmentPage = new FragmentPage();
        Bundle args = new Bundle();
        args.putInt("PAGE_NUM", position);
        fragmentPage.setArguments(args);
        return fragmentPage;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.pageNum = getArguments().getInt("PAGE_NUM");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page, container, false);

        TextView title = (TextView) rootView.findViewById(R.id.page_number);
        title.setText(String.valueOf(pageNum));

        TextView text = (TextView) rootView.findViewById(R.id.page_text);
        text.setText(R.string.lorem_ipsum_text_1);

        return rootView;
    }
}
