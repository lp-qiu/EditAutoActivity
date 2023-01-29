package com.example.editautoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView ac_text;
    private String[] strArray = {"第一","第一个","第一个月","第一个月的工资","第一个月的任务","第一个月的工作任务","第二","第二个"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ac_text = (AutoCompleteTextView) findViewById(R.id.ac_text);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item_dropdown, strArray);
        ac_text.setAdapter(adapter);
    }
}