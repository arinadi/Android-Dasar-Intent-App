package com.dicoding.dasarintentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMoveAct;
    private Button btnMoveActData;
    private Button btnMoveActObj;
    private Button btnDialPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveAct = (Button)findViewById(R.id.move_activity);
        btnMoveAct.setOnClickListener(this);

        btnMoveActData = (Button)findViewById(R.id.move_activity_data);
        btnMoveActData.setOnClickListener(this);

        btnMoveActObj = (Button)findViewById(R.id.move_activity_obj);
        btnMoveActObj.setOnClickListener(this);

        btnDialPhone = (Button)findViewById(R.id.dial_phone);
        btnDialPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.move_activity_data:
                Intent moveData = new Intent(MainActivity.this, MoveDataActivity.class);
                moveData.putExtra(MoveDataActivity.EXTRA_NAME, "Arinadi Nur Rohmad");
                moveData.putExtra(MoveDataActivity.EXTRA_AGE, 21);
                startActivity(moveData);
                break;
            case R.id.move_activity_obj:
                Person mPerson = new Person();
                mPerson.setAge(21);
                mPerson.setName("Arinadi Nur Rohmad");
                mPerson.setCity("Yogyakarta");
                mPerson.setEmail("arinadi.nur@gmail.com");
                Intent moveObj = new Intent(MainActivity.this, MoveObjActivity.class);
                moveObj.putExtra(MoveObjActivity.EXTRA_PERSON, mPerson);
                startActivity(moveObj);
                break;
            case R.id.dial_phone:
                String phone = "085877599770";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone));
                startActivity(dialPhone);
                break;
        }
    }
}
