package com.example.fm303073.td2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);


        NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker);
        np.setMaxValue(105);
        np.setMinValue(18);
        np.setValue(30);

    }
}
