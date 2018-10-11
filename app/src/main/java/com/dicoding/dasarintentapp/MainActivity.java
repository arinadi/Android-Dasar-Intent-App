package com.dicoding.dasarintentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMoveAct;
    private Button btnMoveActData;
    private Button btnDialPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveAct = (Button)findViewById(R.id.pindah_activity);
        btnMoveAct.setOnClickListener(this);
        btnMoveActData = (Button)findViewById(R.id.pindah_activity_w_data);
        btnMoveActData.setOnClickListener(this);
        btnDialPhone = (Button)findViewById(R.id.dial_phone);
        btnDialPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pindah_activity:
                Intent moveIntent = new Intent(MainActivity.this, PindahActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.pindah_activity_w_data:
                Intent pindahData = new Intent(MainActivity.this, PindahDataActivity.class);
                pindahData.putExtra(PindahDataActivity.EXTRA_NAME, "Arinadi Nur Rohmad");
                pindahData.putExtra(PindahDataActivity.EXTRA_AGE, 21);
                startActivity(pindahData);
                break;
            case R.id.dial_phone:
                String phone = "085877599770";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone));
                startActivity(dialPhone);
                break;
        }
    }
}
