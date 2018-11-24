package com.dicoding.dasarintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MoveResultActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSubmit;
    RadioButton rdPet;
    RadioGroup choosePet;

    public static String EXTRA_SELECTED_VALUE = "extra_selected_value";
    public static int RESULT_CODE = 110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_result);

        btnSubmit = findViewById(R.id.btnSubmit);
        choosePet = findViewById(R.id.choosePet);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnSubmit){
            if(choosePet.getCheckedRadioButtonId() != 0){
                String sound = "...";
                String txtPet = "";
                String txtResult = "";

                // get selected radio button from radioGroup
                int selectedId = choosePet.getCheckedRadioButtonId();
                rdPet = findViewById(selectedId);
                txtPet = String.valueOf(rdPet.getText());

                // get id radio button from radioGroup
                switch (choosePet.getCheckedRadioButtonId()){
                    case R.id.rdKucing:
                        sound = "Meong";
                        break;
                    case R.id.rdAnjing:
                        sound = "Guk-Guk";
                        break;
                    case R.id.rdBurung:
                        sound = "Kuk-Kuk Kur";
                        break;
                }

                txtResult = "Kamu memilih "+txtPet+" Sebagai binatang peliharaan, tirukan suaranya \""+sound+"\"";

                Intent resultIntent = new Intent();
                resultIntent.putExtra(EXTRA_SELECTED_VALUE, txtResult);
                setResult(RESULT_CODE, resultIntent);
                finish();
            }
        }
    }
}
