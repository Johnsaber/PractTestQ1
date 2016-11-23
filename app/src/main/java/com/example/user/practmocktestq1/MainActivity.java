package com.example.user.practmocktestq1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etName, etPhone;
    RadioButton rdbtnMale, rdbtnFemale;
    TextView tvStatus;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        etPhone = (EditText) findViewById((R.id.etPhoneNo));
        tvStatus = (TextView) findViewById(R.id.tvStatus);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        rdbtnMale = (RadioButton) findViewById(R.id.rdBtnMale);
        rdbtnFemale = (RadioButton) findViewById(R.id.rdBtnFemale);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String phone = etPhone.getText().toString();
                boolean male  = rdbtnMale.isChecked();
                boolean female = rdbtnFemale.isChecked();

                tvStatus.setText(name +","+phone+","+male+","+female);
            }
        });
    }
}
