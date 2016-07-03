package com.lighthouse.fragmentmanager;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentA extends Fragment {

    public static final String FRAG_A_TAG = "FRAGMENT_A_TAG";

    private FragmentBController controller;

    private Button recreateB;
    private Button showB;
    private Button hideB;
    private Button detachB;

    public interface FragmentBController {
        void recreateB();

        void showB();

        void hideB();

        void detachB();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        recreateB = (Button) view.findViewById(R.id.fragment_a_recreateB_Button);
        recreateB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.recreateB();
            }
        });

        showB = (Button) view.findViewById(R.id.fragment_a_showB_Button);
        showB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.showB();
            }
        });

        hideB = (Button) view.findViewById(R.id.fragment_a_hideB_Button);
        hideB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.hideB();
            }
        });

        detachB = (Button) view.findViewById(R.id.fragment_a_detachB_Button);
        detachB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.detachB();
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            controller = (FragmentBController) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                                                 + " must implement FragmentAController");
        }
    }

}
