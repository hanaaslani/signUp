package com.example.haniyeaslani.signupui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button=(Button)findViewById(R.id.btnSignIn);






        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editTextName=(EditText)findViewById(R.id.edtName);
                EditText editTextFamily=(EditText)findViewById(R.id.edtFamily);
                EditText editTextAge=(EditText)findViewById(R.id.edtAge);
                EditText editTextEmail=(EditText)findViewById(R.id.edtEmail);
                EditText editTextPhone=(EditText)findViewById(R.id.edtPhoneNumber);

                final String name=editTextName.getText().toString();
                final String family=editTextFamily.getText().toString();
                final String age=editTextAge.getText().toString();
                final String email=editTextEmail.getText().toString();
                final String phone=editTextPhone.getText().toString();


                Intent intent=new Intent(MainActivity.this,Homepage.class);


                intent.putExtra("nameContent",name);
                intent.putExtra("familyContent",family);
                intent.putExtra("ageContent",age);
                intent.putExtra("emailContent",email);
                intent.putExtra("phoneContent",phone);

                startActivity(intent);






            }
        });


    }
}
