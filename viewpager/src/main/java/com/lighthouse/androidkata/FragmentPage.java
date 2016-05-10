package com.lighthouse.androidkata;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentPage extends Fragment{
    private int pageNumber;

    public FragmentPage() {
    }


    public static Fragment create(int position) {
        FragmentPage page = new FragmentPage();
        Bundle args = new Bundle();
        args.putInt("PAGE_NUM", position);
        page.setArguments(args);

        return page;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.pageNumber = getArguments().getInt("PAGE_NUM");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page, container, false);

        TextView title = (TextView) rootView.findViewById(R.id.title);
        title.setText(String.valueOf(pageNumber));

        TextView text = (TextView) rootView.findViewById(R.id.text);
        text.setText(getString(R.string.lorem_ipsum_text_1));

        return rootView;

    }
}
