package com.lighthouse.fragmentmanager;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentB extends Fragment {

    public static final String FRAG_B_TAG = "FRAGMENT_B_TAG";

    private FragmentAController controller;

    private Button recreateA;
    private Button showA;
    private Button hideA;
    private Button detachA;

    public interface FragmentAController {
        void recreateA();

        void showA();

        void hideA();

        void detachA();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        recreateA = (Button) view.findViewById(R.id.fragment_b_recreateA_Button);
        recreateA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.recreateA();
            }
        });

        showA = (Button) view.findViewById(R.id.fragment_b_showA_Button);
        showA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.showA();
            }
        });

        hideA = (Button) view.findViewById(R.id.fragment_b_hideA_Button);
        hideA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.hideA();
            }
        });

        detachA = (Button) view.findViewById(R.id.fragment_b_detachA_Button);
        detachA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.detachA();
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
            controller = (FragmentAController) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                                                 + " must implement FragmentAController");
        }
    }
}
