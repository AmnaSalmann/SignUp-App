package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView email =(TextView) findViewById(R.id.email);
        TextView password =(TextView) findViewById(R.id.password);
        TextView name =(TextView) findViewById(R.id.name);
        TextView contact =(TextView) findViewById(R.id.contact);

        MaterialButton btn = (MaterialButton) findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);


                EditText name = (EditText) findViewById(R.id.name);

                MaterialButton regbtn = (MaterialButton) findViewById(R.id.btn);

                regbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name1 = name.getText().toString();
                        Toast.makeText(MainActivity.this,"Username is"+name1,Toast.LENGTH_SHORT).show();
                    }
                });

            }
                               }