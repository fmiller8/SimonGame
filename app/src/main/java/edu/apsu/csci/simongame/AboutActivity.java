package edu.apsu.csci.simongame;

import android.os.Bundle;
import android.app.Activity;

public class AboutActivity extends Activity {
    private String about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
