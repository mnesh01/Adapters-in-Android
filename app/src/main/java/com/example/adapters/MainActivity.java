package com.example.adapters;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ListView listview;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Adapter view
        listview = findViewById(R.id.listview);

        // Adapter acts as a bridge between the data source and adapter view
        // data source -> arrays/lists
        String[] countries = {"Germany", "France", "Belgium", "Poland"};

        //adapter
        MyCustomAdapter adapter = new MyCustomAdapter(this, countries);

        // list listview with the adapter
        listview.setAdapter(adapter);

        }
    }