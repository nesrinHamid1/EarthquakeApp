package com.example.android.earthquake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

import static com.example.android.earthquake.QueryUtils.extractEarthquakes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Earthquake> earthquakes = extractEarthquakes();

        EarthquakeAdapter flavorAdapter = new EarthquakeAdapter(this, earthquakes );

        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(flavorAdapter);
    }
}