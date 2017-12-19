package com.example.abdullah.fall173rdlabtask1;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etusername , etpassword;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etusername = (EditText) findViewById(R.id.etusername);
        final String struser = etusername.getText().toString();
        etpassword = (EditText) findViewById(R.id.etpassword);
        final  String strpass = etpassword.getText().toString();
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                final String struser = etusername.getText().toString();
                final String strpass = etpassword.getText().toString();
                if(struser.equals("") || strpass.equals("")) {

                    Toast.makeText(MainActivity.this, "Enter Username and Password", Toast.LENGTH_SHORT).show();
                }
                 else if(struser.equals(etpassword.getText().toString())){
                    Toast.makeText(MainActivity.this,"Username and Password Are Same", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(MainActivity.this, "Username And Password Are Incorrect", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
