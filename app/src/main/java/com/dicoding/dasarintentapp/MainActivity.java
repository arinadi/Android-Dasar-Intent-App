package com.dicoding.dasarintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMoveAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveAct = (Button)findViewById(R.id.pindah_activity);
        btnMoveAct.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pindah_activity:
                Intent moveIntent = new Intent(MainActivity.this, PindahActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
