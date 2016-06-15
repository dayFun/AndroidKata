
package com.lighthouse.daggerscopes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    String kingString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScopedApplication.getApplication(this).getKingComponent().inject(this);

        Toast.makeText(this, "King String = " + kingString, Toast.LENGTH_SHORT).show();
    }
}
