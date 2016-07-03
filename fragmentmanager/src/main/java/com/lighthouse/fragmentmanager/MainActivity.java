package com.lighthouse.fragmentmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FragmentA.FragmentBController, FragmentB.FragmentAController {

    private FragmentA fragmentA;
    private FragmentB fragmentB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentA = new FragmentA();
        fragmentB = new FragmentB();

        getFragmentManager().beginTransaction()
                            .add(R.id.fragment_container_top, fragmentA, FragmentA.FRAG_A_TAG)
                            .add(R.id.fragment_container_bottom, fragmentB, FragmentB.FRAG_B_TAG)
                            .commit();
    }

    @Override
    public void recreateB() {
        FragmentB newFragB = new FragmentB();
        this.fragmentB = newFragB;
        getFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container_bottom, newFragB, FragmentB.FRAG_B_TAG)
                .commit();
    }

    @Override
    public void showB() {
        getFragmentManager()
                .beginTransaction()
                .show(fragmentB)
                .commit();
    }

    @Override
    public void hideB() {
        getFragmentManager()
                .beginTransaction()
                .hide(fragmentB)
                .commit();
    }

    @Override
    public void detachB() {
        getFragmentManager()
                .beginTransaction()
                .detach(fragmentB)
                .commit();
    }

    @Override
    public void recreateA() {
        FragmentA newFragA = new FragmentA();
        this.fragmentA = newFragA;
        getFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container_top, newFragA, FragmentA.FRAG_A_TAG)
                .commit();
    }

    @Override
    public void showA() {
        getFragmentManager()
                .beginTransaction()
                .show(fragmentA)
                .commit();
    }

    @Override
    public void hideA() {
        getFragmentManager()
                .beginTransaction()
                .hide(fragmentA)
                .commit();
    }

    @Override
    public void detachA() {
        getFragmentManager()
                .beginTransaction()
                .detach(fragmentA)
                .commit();
    }
}
