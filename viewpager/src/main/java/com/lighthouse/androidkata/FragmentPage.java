package com.lighthouse.androidkata;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentPage extends Fragment {

    private int pageNumber;

    public FragmentPage() {
    }

    public static FragmentPage create(int pageNumber) {
        FragmentPage fragmentPage = new FragmentPage();
        Bundle args = new Bundle();
        args.putInt("PAGE_NUM", pageNumber);
        fragmentPage.setArguments(args);
        return fragmentPage;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.pageNumber = getArguments().getInt("PAGE_NUM");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_pager_page, container, false);

        TextView title = (TextView) view.findViewById(R.id.title);
        title.setText(String.valueOf(pageNumber));

        TextView text = (TextView) view.findViewById(R.id.text);
        text.setText(getString(R.string.lorem_ipsum_text_1));

        return view;
    }
}
