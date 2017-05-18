package com.gulbalasalamov.edittextautocompletedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class EditTextAutoComplete extends AppCompatActivity {

    AutoCompleteTextView actv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_auto_complete);

        actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        String[] sehirler = {"Istanbul", "Ankara", "Izmir", "Adana", "Eskişehir", "Bursa"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, sehirler);

        actv.setThreshold(2);

        actv.setAdapter(adapter);
    }
}
