package com.dicoding.dasarintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveDataActivity extends AppCompatActivity {

    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_AGE = "extra_age";
    private TextView txtDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_data);

        txtDataReceived = (TextView)findViewById(R.id.data_receiver);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String text = "Name : "+name+", Your Age : "+age;
        txtDataReceived.setText(text);

    }
}
