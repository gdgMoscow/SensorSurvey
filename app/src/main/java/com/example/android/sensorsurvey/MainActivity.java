package com.example.android.sensorsurvey;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * SensorSurvey queries the sensor manager for a list of available
 * sensors, and displays the list in a TextView.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
