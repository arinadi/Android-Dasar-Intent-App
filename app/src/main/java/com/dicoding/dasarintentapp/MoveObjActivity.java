package com.dicoding.dasarintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveObjActivity extends AppCompatActivity {
    public static String EXTRA_PERSON = "extra_person";
    private TextView txtObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_obj);

        txtObject = (TextView)findViewById(R.id.obj_receiver);
        Person mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);

        String text = "Name : " + mPerson.getName() + ", Email : " + mPerson.getEmail() + ", Usia : " + mPerson.getAge() + ", Lokasi : " + mPerson.getCity();

        txtObject.setText(text);
    }
}
