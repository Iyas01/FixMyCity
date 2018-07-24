// This is the second activity.
// This activity is called when each buttons on the MainActivity is pressed.

package com.example.android.fixmycity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReportActivity extends AppCompatActivity {

    private String banner_name; // container for the banner name

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        this.setTitle(banner_name);
    }
}
